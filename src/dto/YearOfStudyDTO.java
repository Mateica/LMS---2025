package dto;

import java.time.LocalDateTime;
import java.util.List;

public class YearOfStudyDTO {
	private String username;
	private LocalDateTime yearOfStudy;
	private List<SubjectDTO> subjects;

	public YearOfStudyDTO() {
	}

	public YearOfStudyDTO(String username, LocalDateTime yearOfStudy, List<SubjectDTO> subjects) {
		this.username = username;
		this.yearOfStudy = yearOfStudy;
		this.subjects = subjects;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public LocalDateTime getYearOfStudy() {
		return yearOfStudy;
	}

	public void setYearOfStudy(LocalDateTime yearOfStudy) {
		this.yearOfStudy = yearOfStudy;
	}

	public List<SubjectDTO> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<SubjectDTO> subjects) {
		this.subjects = subjects;
	}
}
