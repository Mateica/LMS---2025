package dto;

import java.time.LocalDateTime;

public class ClassTimeDTO {
	private Long id;
	private LocalDateTime startTime;
	private LocalDateTime endTime;
	private AftermathDTO aftermath;
	private ClassTypeDTO classType;
	private SubjectRealizationDTO subjectRealization;

	public ClassTimeDTO() {
	}

	public ClassTimeDTO(Long id, LocalDateTime startTime, LocalDateTime endTime, AftermathDTO aftermath,
			ClassTypeDTO classType, SubjectRealizationDTO subjectRealization) {
		this.id = id;
		this.startTime = startTime;
		this.endTime = endTime;
		this.aftermath = aftermath;
		this.classType = classType;
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

	public AftermathDTO getAftermath() {
		return aftermath;
	}

	public void setAftermath(AftermathDTO aftermath) {
		this.aftermath = aftermath;
	}

	public ClassTypeDTO getClassType() {
		return classType;
	}

	public void setClassType(ClassTypeDTO classType) {
		this.classType = classType;
	}

	public SubjectRealizationDTO getSubjectRealization() {
		return subjectRealization;
	}

	public void setSubjectRealization(SubjectRealizationDTO subjectRealization) {
		this.subjectRealization = subjectRealization;
	}
}
