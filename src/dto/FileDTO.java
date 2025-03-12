package dto;

public class FileDTO {
	private Long id;
	private String url;
	private String description;

	public FileDTO() {
	}

	public FileDTO(Long id, String url, String description) {
		this.id = id;
		this.url = url;
		this.description = description;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
