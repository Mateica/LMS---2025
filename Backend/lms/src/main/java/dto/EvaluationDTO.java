package dto;

import java.time.LocalDateTime;

public class EvaluationDTO {
	private Long id;
	private LocalDateTime startTime;
	private LocalDateTime endTime;
	private int numberOfPoints;
	private String evaluationType;
	private EvaluationInstrumentDTO evaluationInstrument;
	private ExaminationDTO examination;

	public EvaluationDTO() {
	}

	public EvaluationDTO(Long id, LocalDateTime startTime, LocalDateTime endTime, int numberOfPoints,
			String evaluationType, EvaluationInstrumentDTO evaluationInstrument, ExaminationDTO examination) {
		this.id = id;
		this.startTime = startTime;
		this.endTime = endTime;
		this.numberOfPoints = numberOfPoints;
		this.evaluationType = evaluationType;
		this.evaluationInstrument = evaluationInstrument;
		this.examination = examination;
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

	public int getNumberOfPoints() {
		return numberOfPoints;
	}

	public void setNumberOfPoints(int numberOfPoints) {
		this.numberOfPoints = numberOfPoints;
	}

	public String getEvaluationType() {
		return evaluationType;
	}

	public void setEvaluationType(String evaluationType) {
		this.evaluationType = evaluationType;
	}

	public EvaluationInstrumentDTO getEvaluationInstrument() {
		return evaluationInstrument;
	}

	public void setEvaluationInstrument(EvaluationInstrumentDTO evaluationInstrument) {
		this.evaluationInstrument = evaluationInstrument;
	}

	public ExaminationDTO getExamination() {
		return examination;
	}

	public void setExamination(ExaminationDTO examination) {
		this.examination = examination;
	}
}
