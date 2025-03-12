package dto;

import java.util.List;

public class ForumDTO {
	private Long id;
	private boolean visible;
	private List<TopicDTO> topics;
	private List<ForumUserDTO> forumUsers;

	public ForumDTO() {
	}

	public ForumDTO(Long id, boolean visible, List<TopicDTO> topics, List<ForumUserDTO> forumUsers) {
		this.id = id;
		this.visible = visible;
		this.topics = topics;
		this.forumUsers = forumUsers;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public boolean isVisible() {
		return visible;
	}

	public void setVisible(boolean visible) {
		this.visible = visible;
	}

	public List<TopicDTO> getTopics() {
		return topics;
	}

	public void setTopics(List<TopicDTO> topics) {
		this.topics = topics;
	}

	public List<ForumUserDTO> getForumUsers() {
		return forumUsers;
	}

	public void setForumUsers(List<ForumUserDTO> forumUsers) {
		this.forumUsers = forumUsers;
	}
}
