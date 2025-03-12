package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class StudyProgramme {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Lob
	@Column(nullable = false)
	private String name;
	
	@ManyToOne
	@Column(nullable = false)
	private Faculty faculty;
	
	@OneToOne
	@Column(nullable = false)
	private YearOfStudy yearOfStudy;
	
	@OneToOne
	@Column(nullable = false)
	private Teacher teacher;
	
	@Column(nullable = false)
	private Boolean active;

	public StudyProgramme() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudyProgramme(Long id, String name, Faculty faculty, YearOfStudy yearOfStudy, Teacher teacher) {
		super();
		this.id = id;
		this.name = name;
		this.faculty = faculty;
		this.yearOfStudy = yearOfStudy;
		this.teacher = teacher;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Faculty getFaculty() {
		return faculty;
	}

	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}

	public YearOfStudy getYearOfStudy() {
		return yearOfStudy;
	}

	public void setYearOfStudy(YearOfStudy yearOfStudy) {
		this.yearOfStudy = yearOfStudy;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}
	
	
}
