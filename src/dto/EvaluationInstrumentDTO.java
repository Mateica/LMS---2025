package dto;

public class EvaluationInstrumentDTO {
	private Long id;
	private FileDTO file;

	public EvaluationInstrumentDTO() {
	}

	public EvaluationInstrumentDTO(Long id, FileDTO file) {
		this.id = id;
		this.file = file;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public FileDTO getFile() {
		return file;
	}

	public void setFile(FileDTO file) {
		this.file = file;
	}
}
