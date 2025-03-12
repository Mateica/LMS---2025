package dto;

import java.util.List;

public class FacultyDTO {
	private Long id;
	private String name;
	private AddressDTO address;
	private TeacherDTO headmaster;
	private UniversityDTO university;
	private List<StudyProgrammeDTO> studyProgrammes;

	public FacultyDTO() {
	}

	public FacultyDTO(Long id, String name, AddressDTO address, TeacherDTO headmaster, UniversityDTO university,
			List<StudyProgrammeDTO> studyProgrammes) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.headmaster = headmaster;
		this.university = university;
		this.studyProgrammes = studyProgrammes;
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

	public AddressDTO getAddress() {
		return address;
	}

	public void setAddress(AddressDTO address) {
		this.address = address;
	}

	public TeacherDTO getHeadmaster() {
		return headmaster;
	}

	public void setHeadmaster(TeacherDTO headmaster) {
		this.headmaster = headmaster;
	}

	public UniversityDTO getUniversity() {
		return university;
	}

	public void setUniversity(UniversityDTO university) {
		this.university = university;
	}

	public List<StudyProgrammeDTO> getStudyProgrammes() {
		return studyProgrammes;
	}

	public void setStudyProgrammes(List<StudyProgrammeDTO> studyProgrammes) {
		this.studyProgrammes = studyProgrammes;
	}
}
