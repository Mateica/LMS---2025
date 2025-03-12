package dto;

public class StudentDTO {
	private String username; // Korisničko ime umesto ID-a
	private String firstName;
	private String lastName;
	private String umcn;
	private String indexNumber;
	private AddressDTO address;
	private StudentOnYearDTO studentOnYear;
	private SubjectAttendanceDTO subjectAttendance;

	public StudentDTO() {
	}

	public StudentDTO(String username, String firstName, String lastName, String umcn, String indexNumber,
			AddressDTO address, StudentOnYearDTO studentOnYear, SubjectAttendanceDTO subjectAttendance) {
		this.username = username;
		this.firstName = firstName;
		this.lastName = lastName;
		this.umcn = umcn;
		this.indexNumber = indexNumber;
		this.address = address;
		this.studentOnYear = studentOnYear;
		this.subjectAttendance = subjectAttendance;
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

	public String getIndexNumber() {
		return indexNumber;
	}

	public void setIndexNumber(String indexNumber) {
		this.indexNumber = indexNumber;
	}

	public AddressDTO getAddress() {
		return address;
	}

	public void setAddress(AddressDTO address) {
		this.address = address;
	}

	public StudentOnYearDTO getStudentOnYear() {
		return studentOnYear;
	}

	public void setStudentOnYear(StudentOnYearDTO studentOnYear) {
		this.studentOnYear = studentOnYear;
	}

	public SubjectAttendanceDTO getSubjectAttendance() {
		return subjectAttendance;
	}

	public void setSubjectAttendance(SubjectAttendanceDTO subjectAttendance) {
		this.subjectAttendance = subjectAttendance;
	}
}
