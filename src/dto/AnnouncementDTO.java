package dto;

import java.time.LocalDateTime;
import java.util.List;

public class AnnouncementDTO {
	private Long id;
	private LocalDateTime datePublished;
	private String content;
	private ForumUserDTO author;
	private List<FileDTO> attachments;
	private TopicDTO topic;

	public AnnouncementDTO() {
	}

	public AnnouncementDTO(Long id, LocalDateTime datePublished, String content, ForumUserDTO author,
			List<FileDTO> attachments, TopicDTO topic) {
		this.id = id;
		this.datePublished = datePublished;
		this.content = content;
		this.author = author;
		this.attachments = attachments;
		this.topic = topic;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDateTime getDatePublished() {
		return datePublished;
	}

	public void setDatePublished(LocalDateTime datePublished) {
		this.datePublished = datePublished;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public ForumUserDTO getAuthor() {
		return author;
	}

	public void setAuthor(ForumUserDTO author) {
		this.author = author;
	}

	public List<FileDTO> getAttachments() {
		return attachments;
	}

	public void setAttachments(List<FileDTO> attachments) {
		this.attachments = attachments;
	}

	public TopicDTO getTopic() {
		return topic;
	}

	public void setTopic(TopicDTO topic) {
		this.topic = topic;
	}
}
