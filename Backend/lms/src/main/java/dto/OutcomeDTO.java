package dto;

public class OutcomeDTO {
	private Long id;
	private String description;
	private EducationGoalDTO educationGoal;
	private TeachingMaterialDTO teachingMaterial;
	private SubjectDTO subject;

	public OutcomeDTO() {
	}

	public OutcomeDTO(Long id, String description, EducationGoalDTO educationGoal,
			TeachingMaterialDTO teachingMaterial, SubjectDTO subject) {
		this.id = id;
		this.description = description;
		this.educationGoal = educationGoal;
		this.teachingMaterial = teachingMaterial;
		this.subject = subject;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public EducationGoalDTO getEducationGoal() {
		return educationGoal;
	}

	public void setEducationGoal(EducationGoalDTO educationGoal) {
		this.educationGoal = educationGoal;
	}

	public TeachingMaterialDTO getTeachingMaterial() {
		return teachingMaterial;
	}

	public void setTeachingMaterial(TeachingMaterialDTO teachingMaterial) {
		this.teachingMaterial = teachingMaterial;
	}

	public SubjectDTO getSubject() {
		return subject;
	}

	public void setSubject(SubjectDTO subject) {
		this.subject = subject;
	}
}
