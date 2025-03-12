package dto;

import java.time.LocalDate;

public class TitleDTO {
	private String username;
	private LocalDate dateElected;
	private LocalDate dateAbolished;
	private ScientificFieldDTO scientificField;
	private String titleType;

	public TitleDTO() {
	}

	public TitleDTO(String username, LocalDate dateElected, LocalDate dateAbolished, ScientificFieldDTO scientificField,
			String titleType) {
		this.username = username;
		this.dateElected = dateElected;
		this.dateAbolished = dateAbolished;
		this.scientificField = scientificField;
		this.titleType = titleType;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public LocalDate getDateElected() {
		return dateElected;
	}

	public void setDateElected(LocalDate dateElected) {
		this.dateElected = dateElected;
	}

	public LocalDate getDateAbolished() {
		return dateAbolished;
	}

	public void setDateAbolished(LocalDate dateAbolished) {
		this.dateAbolished = dateAbolished;
	}

	public ScientificFieldDTO getScientificField() {
		return scientificField;
	}

	public void setScientificField(ScientificFieldDTO scientificField) {
		this.scientificField = scientificField;
	}

	public String getTitleType() {
		return titleType;
	}

	public void setTitleType(String titleType) {
		this.titleType = titleType;
	}
}
