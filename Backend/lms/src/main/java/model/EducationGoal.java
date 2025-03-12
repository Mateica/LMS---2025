package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToOne;

@Entity
public class EducationGoal {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Lob
	@Column(nullable = false)
	private String description;
	
	@OneToOne
	@Column(nullable = true)
	private Outcome outcome;
	
	@Column(nullable = false)
	private Boolean active;

	public EducationGoal() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EducationGoal(Long id, String description, Outcome outcome) {
		super();
		this.id = id;
		this.description = description;
		this.outcome = outcome;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Outcome getOutcome() {
		return outcome;
	}

	public void setAftermath(Outcome outcome) {
		this.outcome = outcome;
	}
	
	
	
}
