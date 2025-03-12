package dto;

import java.time.LocalDate;
import java.util.List;

public class UniversityDTO {
	private String username;
	private String name;
	private LocalDate dateEstablished;
	private AddressDTO address;
	private TeacherDTO rector;
	private List<FacultyDTO> faculties;

	public UniversityDTO() {
	}

	public UniversityDTO(String username, String name, LocalDate dateEstablished, AddressDTO address, TeacherDTO rector,
			List<FacultyDTO> faculties) {
		this.username = username;
		this.name = name;
		this.dateEstablished = dateEstablished;
		this.address = address;
		this.rector = rector;
		this.faculties = faculties;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDateEstablished() {
		return dateEstablished;
	}

	public void setDateEstablished(LocalDate dateEstablished) {
		this.dateEstablished = dateEstablished;
	}

	public AddressDTO getAddress() {
		return address;
	}

	public void setAddress(AddressDTO address) {
		this.address = address;
	}

	public TeacherDTO getRector() {
		return rector;
	}

	public void setRector(TeacherDTO rector) {
		this.rector = rector;
	}

	public List<FacultyDTO> getFaculties() {
		return faculties;
	}

	public void setFaculties(List<FacultyDTO> faculties) {
		this.faculties = faculties;
	}
}
