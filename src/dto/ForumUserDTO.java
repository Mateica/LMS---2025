package dto;

import java.util.List;

public class ForumUserDTO {
	private String username;
	private ForumDTO forum;
	private RoleDTO role;
	private List<TopicDTO> topics;
	private List<AnnouncementDTO> announcements;

	public ForumUserDTO() {
	}

	public ForumUserDTO(String username, ForumDTO forum, RoleDTO role, List<TopicDTO> topics,
			List<AnnouncementDTO> announcements) {
		this.username = username;
		this.forum = forum;
		this.role = role;
		this.topics = topics;
		this.announcements = announcements;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public ForumDTO getForum() {
		return forum;
	}

	public void setForum(ForumDTO forum) {
		this.forum = forum;
	}

	public RoleDTO getRole() {
		return role;
	}

	public void setRole(RoleDTO role) {
		this.role = role;
	}

	public List<TopicDTO> getTopics() {
		return topics;
	}

	public void setTopics(List<TopicDTO> topics) {
		this.topics = topics;
	}

	public List<AnnouncementDTO> getAnnouncements() {
		return announcements;
	}

	public void setAnnouncements(List<AnnouncementDTO> announcements) {
		this.announcements = announcements;
	}
}
