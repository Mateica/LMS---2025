package dto;

public class EducationGoalDTO {
	private Long id;
	private String description;
	private OutcomeDTO outcome;

	public EducationGoalDTO() {
	}

	public EducationGoalDTO(Long id, String description, OutcomeDTO outcome) {
		this.id = id;
		this.description = description;
		this.outcome = outcome;
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

	public OutcomeDTO getOutcome() {
		return outcome;
	}

	public void setOutcome(OutcomeDTO outcome) {
		this.outcome = outcome;
	}
}
