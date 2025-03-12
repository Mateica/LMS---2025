package dto;

public class ScientificFieldDTO {
	private Long id;
	private String name;
	private TeacherDTO teacher;

	public ScientificFieldDTO() {
	}

	public ScientificFieldDTO(Long id, String name, TeacherDTO teacher) {
		this.id = id;
		this.name = name;
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

	public TeacherDTO getTeacher() {
		return teacher;
	}

	public void setTeacher(TeacherDTO teacher) {
		this.teacher = teacher;
	}
}
