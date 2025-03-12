package dto;

import java.util.List;

public class TopicDTO {
	private String username;
	private String name;
	private ForumUserDTO author;
	private List<AnnouncementDTO> announcements;
	private ForumDTO forum;

	public TopicDTO() {
	}

	public TopicDTO(String username, String name, ForumUserDTO author, List<AnnouncementDTO> announcements,
			ForumDTO forum) {
		this.username = username;
		this.name = name;
		this.author = author;
		this.announcements = announcements;
		this.forum = forum;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ForumUserDTO getAuthor() {
		return author;
	}

	public void setAuthor(ForumUserDTO author) {
		this.author = author;
	}

	public List<AnnouncementDTO> getAnnouncements() {
		return announcements;
	}

	public void setAnnouncements(List<AnnouncementDTO> announcements) {
		this.announcements = announcements;
	}

	public ForumDTO getForum() {
		return forum;
	}

	public void setForum(ForumDTO forum) {
		this.forum = forum;
	}
}
