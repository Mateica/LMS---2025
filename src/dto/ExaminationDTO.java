package dto;

public class ExaminationDTO {
	private Long id;
	private double numberOfPoints;
	private String note;

	public ExaminationDTO() {
	}

	public ExaminationDTO(Long id, double numberOfPoints, String note) {
		this.id = id;
		this.numberOfPoints = numberOfPoints;
		this.note = note;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public double getNumberOfPoints() {
		return numberOfPoints;
	}

	public void setNumberOfPoints(double numberOfPoints) {
		this.numberOfPoints = numberOfPoints;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}
}
