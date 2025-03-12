package dto;

import java.time.LocalDateTime;
import java.util.List;

public class TeachingMaterialDTO {
	private Long id;
	private String name;
	private List<String> authors;
	private LocalDateTime yearOfPublication;
	private FileDTO file;

	public TeachingMaterialDTO() {
	}

	public TeachingMaterialDTO(Long id, String name, List<String> authors, LocalDateTime yearOfPublication,
			FileDTO file) {
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

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getAuthors() {
		return authors;
	}

	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}

	public LocalDateTime getYearOfPublication() {
		return yearOfPublication;
	}

	public void setYearOfPublication(LocalDateTime yearOfPublication) {
		this.yearOfPublication = yearOfPublication;
	}

	public FileDTO getFile() {
		return file;
	}

	public void setFile(FileDTO file) {
		this.file = file;
	}
}
