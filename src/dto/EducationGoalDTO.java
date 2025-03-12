package dto;

public class EducationGoalDTO {
	private Long id;
	private String description;
	private AftermathDTO aftermath;

	public EducationGoalDTO() {
	}

	public EducationGoalDTO(Long id, String description, AftermathDTO aftermath) {
		this.id = id;
		this.description = description;
		this.aftermath = aftermath;
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

	public AftermathDTO getAftermath() {
		return aftermath;
	}

	public void setAftermath(AftermathDTO aftermath) {
		this.aftermath = aftermath;
	}
}
