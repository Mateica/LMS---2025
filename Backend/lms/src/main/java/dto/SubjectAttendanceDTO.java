package dto;

public class SubjectAttendanceDTO {
	private Long id;
	private int finalGrade;
	private SubjectRealizationDTO subjectRealization;

	public SubjectAttendanceDTO() {
	}

	public SubjectAttendanceDTO(Long id, int finalGrade, SubjectRealizationDTO subjectRealization) {
		this.id = id;
		this.finalGrade = finalGrade;
		this.subjectRealization = subjectRealization;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getFinalGrade() {
		return finalGrade;
	}

	public void setFinalGrade(int finalGrade) {
		this.finalGrade = finalGrade;
	}

	public SubjectRealizationDTO getSubjectRealization() {
		return subjectRealization;
	}

	public void setSubjectRealization(SubjectRealizationDTO subjectRealization) {
		this.subjectRealization = subjectRealization;
	}
}
