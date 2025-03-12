package model;

import java.time.LocalDateTime;
import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class TeachingMaterial {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Lob
	@Column(nullable = false)
	private String name;
	
	@OneToMany(mappedBy = "teaching_material")
	@Column(nullable = false)
	private ArrayList<String> authors; // Da li umesto stringova mogu stajati nastavnici?
	
	@Column(nullable = false)
	private LocalDateTime yearOfPublication;
	
	@Column(nullable = false)
	@OneToOne
	private File file;
	
	@Column(nullable = false)
	private Boolean active;

	public TeachingMaterial() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TeachingMaterial(Long id, String name, ArrayList<String> authors, LocalDateTime yearOfPublication,
			File file) {
		super();
		this.id = id;
		this.name = name;
		this.authors = authors;
		this.yearOfPublication = yearOfPublication;
		this.file = file;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setNaziv(String name) {
		this.name = name;
	}

	public ArrayList<String> getAuthors() {
		return authors;
	}

	public void setAuthors(ArrayList<String> authors) {
		this.authors = authors;
	}

	public LocalDateTime getYearOfPublication() {
		return yearOfPublication;
	}

	public void setYearOfPublication(LocalDateTime yearOfPublication) {
		this.yearOfPublication = yearOfPublication;
	}

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
