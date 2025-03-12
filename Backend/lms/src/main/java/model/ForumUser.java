package model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

public class ForumUser {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	@ManyToOne
	private RegisteredUser registeredUser;
	
	@Column(nullable = true)
	@OneToMany(mappedBy = "forum_user")
	private List<Topic> topics = new ArrayList<Topic>();
	
	@ManyToOne
	@Column(nullable = false)
	private Forum forum;
	
	@OneToOne
	@Column(nullable = false)
	private Role role;
	
	@Column(nullable = true)
	@OneToMany(mappedBy = "forum_user")
	private List<Announcement> announcements = new ArrayList<Announcement>();
	
	@Column(nullable = false)
	private Boolean active;

	public ForumUser() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ForumUser(Long id, RegisteredUser registeredUser, Forum forum, Role role) {
		super();
		this.id = id;
		this.registeredUser = registeredUser;
		this.topics = new ArrayList<Topic>();
		this.forum = forum;
		this.role = role;
		this.announcements = new ArrayList<Announcement>();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public RegisteredUser getRegisteredUser() {
		return registeredUser;
	}

	public void setRegisteredUser(RegisteredUser registeredUser) {
		this.registeredUser = registeredUser;
	}

	public Forum getForum() {
		return forum;
	}

	public void setForum(Forum forum) {
		this.forum = forum;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public List<Announcement> getAnnouncements() {
		return announcements;
	}

	public void setAnnouncements(List<Announcement> announcements) {
		this.announcements = announcements;
	}

	public List<Topic> getTopics() {
		return topics;
	}

	public void setTopics(List<Topic> topics) {
		this.topics = topics;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}
	
	
}
