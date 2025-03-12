package dto;

public class SubjectRealizationDTO {
	private Long id;
	private EvaluationDTO evaluation;
	private TeacherOnRealizationDTO teacherOnRealization;
	private SubjectDTO subject;

	public SubjectRealizationDTO() {
	}

	public SubjectRealizationDTO(Long id, EvaluationDTO evaluation, TeacherOnRealizationDTO teacherOnRealization,
			SubjectDTO subject) {
		this.id = id;
		this.evaluation = evaluation;
		this.teacherOnRealization = teacherOnRealization;
		this.subject = subject;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public EvaluationDTO getEvaluation() {
		return evaluation;
	}

	public void setEvaluation(EvaluationDTO evaluation) {
		this.evaluation = evaluation;
	}

	public TeacherOnRealizationDTO getTeacherOnRealization() {
		return teacherOnRealization;
	}

	public void setTeacherOnRealization(TeacherOnRealizationDTO teacherOnRealization) {
		this.teacherOnRealization = teacherOnRealization;
	}

	public SubjectDTO getSubject() {
		return subject;
	}

	public void setSubject(SubjectDTO subject) {
		this.subject = subject;
	}
}
