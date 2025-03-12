package controller;

import java.util.ArrayList;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import dto.FileDTO;
import model.Announcement;
import model.File;
import model.Forum;
import model.ForumUser;
import model.Message;
import model.RegisteredUser;
import model.Role;
import service.ServiceInterface;

@Controller
@RequestMapping(path = "/api/file")
public class FileController extends BaseController<File, FileDTO> {

	@Override
	@GetMapping
	public ResponseEntity<Iterable<FileDTO>> findAll() {
		ArrayList<FileDTO> files = new ArrayList<FileDTO>();
		
		for(File f : service.findAll()) {
			files.add(new FileDTO(f.getId(), f.getUrl(), f.getDescription()));
		}
		
		return new ResponseEntity<Iterable<FileDTO>>(files, HttpStatus.OK);
	}

	@Override
	@GetMapping(path = "/{id}")
	public ResponseEntity<FileDTO> findById(@PathVariable("id") Long id) {
		File f = service.findById(id).orElse(null);
		
		if(f == null) {
			return new ResponseEntity<FileDTO>(HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<FileDTO>(HttpStatus.OK);
	}

	@Override
	public ResponseEntity<FileDTO> create(@RequestBody FileDTO t) {
		File f = service.create(new File(t.getUrl(), t.getDescription(), 
				new Announcement(t.getId(), t.getAnnoucement().getDatePublished(),t.getAnnoucement().getContent(), t.getAnnoucement().getAuthor(),
						t.getAnnoucement().getAuthor(),t.getAnnoucement().getTopic()), new Message(null, t.getMessage().getTimePublished(),
								t.getMessage().getSender(), t.getMessage().getReceiver())));
		return new ResponseEntity<FileDTO>(HttpStatus.CREATED);
	}

	@Override
	public ResponseEntity<FileDTO> update(@RequestBody FileDTO t, @PathVariable("id") Long id) {
		// TODO Auto-generated method stub
		File f = service.findById(id).orElse(null);
		
		if(f == null) {
			return new ResponseEntity<FileDTO>(HttpStatus.NOT_FOUND);
		}
		
		f.setUrl(t.getUrl());
		f.setDescription(t.getDescription());
		f.setAnnouncement(new Announcement(null, t.getAnnoucement().getDatePublished(), 
				t.getAnnoucement().getContent(), new ForumUser(null, new RegisteredUser(), new Forum(), new Role()), t.getAnnoucement().getTopic()));
		f.setMessage(new Message(t.getMessage().getId(), t.getMessage().getTimePublished(), t.getMessage().getSender(), t.getMessage().getReceiver()));
		
		return new ResponseEntity<FileDTO>(f, HttpStatus.OK);
	}
	
}
