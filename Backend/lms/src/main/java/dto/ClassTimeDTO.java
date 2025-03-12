package dto;

import java.time.LocalDateTime;

public class ClassTimeDTO {
	private Long id;
	private LocalDateTime startTime;
	private LocalDateTime endTime;
	private OutcomeDTO outcome;
	private TeachingTypeDTO teachingType;
	private SubjectRealizationDTO subjectRealization;

	public ClassTimeDTO() {
	}

	public ClassTimeDTO(Long id, LocalDateTime startTime, LocalDateTime endTime, OutcomeDTO outcome,
			TeachingTypeDTO teachingType, SubjectRealizationDTO subjectRealization) {
		this.id = id;
		this.startTime = startTime;
		this.endTime = endTime;
		this.outcome = outcome;
		this.teachingType = teachingType;
		this.subjectRealization = subjectRealization;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDateTime getStartTime() {
		return startTime;
	}

	public void setStartTime(LocalDateTime startTime) {
		this.startTime = startTime;
	}

	public LocalDateTime getEndTime() {
		return endTime;
	}

	public void setEndTime(LocalDateTime endTime) {
		this.endTime = endTime;
	}

	public OutcomeDTO getOutcome() {
		return outcome;
	}

	public void setOutcome(OutcomeDTO outcome) {
		this.outcome = outcome;
	}

	public TeachingTypeDTO getTeachingType() {
		return teachingType;
	}

	public void setTeachingType(TeachingTypeDTO teachingType) {
		this.teachingType = teachingType;
	}

	public SubjectRealizationDTO getSubjectRealization() {
		return subjectRealization;
	}

	public void setSubjectRealization(SubjectRealizationDTO subjectRealization) {
		this.subjectRealization = subjectRealization;
	}
}
