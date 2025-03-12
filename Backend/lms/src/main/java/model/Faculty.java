package model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Faculty {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Lob
	@Column(nullable = false)
	private String name;
	
	@Column(nullable = false)
	@OneToOne
	private Address address;
	
	@Column(nullable = false)
	@OneToOne
	private Teacher headmaster;
	
	
	@ManyToOne
	@Column(nullable = false)
	private University university;
	
	@OneToMany(mappedBy = "faculty")
	@Column(nullable = false)
	private List<StudyProgramme> studyProgrammes = new ArrayList<StudyProgramme>();
	
	@Column(nullable = false)
	private Boolean active;

	public Faculty() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Faculty(Long id, String name, Address address, Teacher headmaster, University university) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.headmaster = headmaster;
		this.university = university;
		this.studyProgrammes = new ArrayList<StudyProgramme>();
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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Teacher getHeadmaster() {
		return headmaster;
	}

	public void setHeadmaster(Teacher headmaster) {
		this.headmaster = headmaster;
	}

	public University getUniversity() {
		return university;
	}

	public void setUniversity(University university) {
		this.university = university;
	}

	public List<StudyProgramme> getStudyProgrammes() {
		return studyProgrammes;
	}

	public void setStudyProgrammes(List<StudyProgramme> studyProgrammes) {
		this.studyProgrammes = studyProgrammes;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}
	
	
	
	
}
