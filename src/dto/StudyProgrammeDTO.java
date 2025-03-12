package dto;

public class StudyProgrammeDTO {
	private Long id;
	private String name;
	private FacultyDTO faculty;
	private YearOfStudyDTO yearOfStudy;
	private TeacherDTO teacher;

	public StudyProgrammeDTO() {
	}

	public StudyProgrammeDTO(Long id, String name, FacultyDTO faculty, YearOfStudyDTO yearOfStudy, TeacherDTO teacher) {
		this.id = id;
		this.name = name;
		this.faculty = faculty;
		this.yearOfStudy = yearOfStudy;
		this.teacher = teacher;
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

	public FacultyDTO getFaculty() {
		return faculty;
	}

	public void setFaculty(FacultyDTO faculty) {
		this.faculty = faculty;
	}

	public YearOfStudyDTO getYearOfStudy() {
		return yearOfStudy;
	}

	public void setYearOfStudy(YearOfStudyDTO yearOfStudy) {
		this.yearOfStudy = yearOfStudy;
	}

	public TeacherDTO getTeacher() {
		return teacher;
	}

	public void setTeacher(TeacherDTO teacher) {
		this.teacher = teacher;
	}
}
