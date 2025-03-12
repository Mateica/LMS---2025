package controller;

import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import dto.AdministratorDTO;
import model.Administrator;

@Controller
@RequestMapping(path = "/api/administrator")
public class AdministratorController extends BaseController<Administrator, AdministratorDTO> {

	@Override
	@GetMapping
	public ResponseEntity<Iterable<AdministratorDTO>> findAll() {
		ArrayList<AdministratorDTO> admins = new ArrayList<AdministratorDTO>();

		for (Administrator a : service.findAll()) {
			String username = a.getUser().getUsername();

			admins.add(new AdministratorDTO(username));
		}
		return new ResponseEntity<Iterable<AdministratorDTO>>(admins, HttpStatus.OK);
	}

	@Override
	@GetMapping(path = "/{id}")
	public ResponseEntity<AdministratorDTO> findById(@PathVariable("id") Long id) {
		Administrator a = service.findById(id).orElse(null);
		if (a == null) {
			return new ResponseEntity<AdministratorDTO>(HttpStatus.NOT_FOUND);
		}

		AdministratorDTO adminDto = new AdministratorDTO();
		String username = a.getUser().getUsername();

		adminDto.setUsername(username);

		return new ResponseEntity<AdministratorDTO>(adminDto, HttpStatus.OK);
	}

	@Override
	@PostMapping
	public ResponseEntity<AdministratorDTO> create(@RequestBody AdministratorDTO t) {
		Administrator admin = new Administrator(RegisteredUserController.getService().findByUsername(t.getUsername()));
		return new ResponseEntity<AdministratorDTO>(HttpStatus.CREATED);
	}

	@Override
	@PutMapping(path = "/{id}")
	public ResponseEntity<AdministratorDTO> update(@RequestBody AdministratorDTO t, @PathVariable("id") Long id) {
		Administrator admin = service.findById(id).orElse(null);

		if (admin == null) {
			return new ResponseEntity<AdministratorDTO>(HttpStatus.NOT_FOUND);
		}

		admin.setUser(RegisteredUserController.getService().findByUsername(t.getUsername()));

		admin = service.update(admin);

		return new ResponseEntity<AdministratorDTO>(HttpStatus.OK);
	}

}
