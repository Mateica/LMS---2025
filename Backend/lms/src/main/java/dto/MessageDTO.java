package dto;

import java.time.LocalDateTime;
import java.util.List;

public class MessageDTO {
	private Long id;
	private LocalDateTime timePublished;
	private String senderUsername;
	private String receiverUsername;
	private List<FileDTO> attachments;

	public MessageDTO() {
	}

	public MessageDTO(Long id, LocalDateTime timePublished, String senderUsername, String receiverUsername,
			List<FileDTO> attachments) {
		this.id = id;
		this.timePublished = timePublished;
		this.senderUsername = senderUsername;
		this.receiverUsername = receiverUsername;
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

	public String getSenderUsername() {
		return senderUsername;
	}

	public void setSenderUsername(String senderUsername) {
		this.senderUsername = senderUsername;
	}

	public String getReceiverUsername() {
		return receiverUsername;
	}

	public void setReceiverUsername(String receiverUsername) {
		this.receiverUsername = receiverUsername;
	}

	public List<FileDTO> getAttachments() {
		return attachments;
	}

	public void setAttachments(List<FileDTO> attachments) {
		this.attachments = attachments;
	}
}
