package dto;

import java.time.LocalDateTime;
import java.util.List;

public class NotificationDTO {
	private Long id;
	private LocalDateTime timePublished;
	private String content;
	private String title;
	private List<FileDTO> attachments;

	public NotificationDTO() {
	}

	public NotificationDTO(Long id, LocalDateTime timePublished, String content, String title,
			List<FileDTO> attachments) {
		this.id = id;
		this.timePublished = timePublished;
		this.content = content;
		this.title = title;
		this.attachments = attachments;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDateTime getTimePublished() {
		return timePublished;
	}

	public void setTimePublished(LocalDateTime timePublished) {
		this.timePublished = timePublished;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<FileDTO> getAttachments() {
		return attachments;
	}

	public void setAttachments(List<FileDTO> attachments) {
		this.attachments = attachments;
	}
}
