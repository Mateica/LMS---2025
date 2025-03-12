package dto;

public class TeacherDTO {
	private String username; // Korisničko ime umesto ID-a
	private String firstName;
	private String lastName;
	private String umcn;
	private TitleDTO title;
	private ScientificFieldDTO scientificField;

	public TeacherDTO() {
	}

	public TeacherDTO(String username, String firstName, String lastName, String umcn, TitleDTO title,
			ScientificFieldDTO scientificField) {
		this.username = username;
		this.firstName = firstName;
		this.lastName = lastName;
		this.umcn = umcn;
		this.title = title;
		this.scientificField = scientificField;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUmcn() {
		return umcn;
	}

	public void setUmcn(String umcn) {
		this.umcn = umcn;
	}

	public TitleDTO getTitle() {
		return title;
	}

	public void setTitle(TitleDTO title) {
		this.title = title;
	}

	public ScientificFieldDTO getScientificField() {
		return scientificField;
	}

	public void setScientificField(ScientificFieldDTO scientificField) {
		this.scientificField = scientificField;
	}
}
