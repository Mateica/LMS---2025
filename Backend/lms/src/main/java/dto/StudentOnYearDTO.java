package dto;

import java.time.LocalDateTime;

public class StudentOnYearDTO {
	private Long id;
	private LocalDateTime dateOfApplication;
	private StudentDTO student;
	private YearOfStudyDTO yearOfStudy;

	public StudentOnYearDTO() {
	}

	public StudentOnYearDTO(Long id, LocalDateTime dateOfApplication, StudentDTO student, YearOfStudyDTO yearOfStudy) {
		this.id = id;
		this.dateOfApplication = dateOfApplication;
		this.student = student;
		this.yearOfStudy = yearOfStudy;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDateTime getDateOfApplication() {
		return dateOfApplication;
	}

	public void setDateOfApplication(LocalDateTime dateOfApplication) {
		this.dateOfApplication = dateOfApplication;
	}

	public StudentDTO getStudent() {
		return student;
	}

	public void setStudent(StudentDTO student) {
		this.student = student;
	}

	public YearOfStudyDTO getYearOfStudy() {
		return yearOfStudy;
	}

	public void setYearOfStudy(YearOfStudyDTO yearOfStudy) {
		this.yearOfStudy = yearOfStudy;
	}
}
