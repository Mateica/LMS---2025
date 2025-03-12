package dto;

public class TeacherOnRealizationDTO {
	private Long id;
	private int numberOfClasses;
	private TeacherDTO teacher;
	private SubjectRealizationDTO subjectRealization;
	private NotificationDTO notification;
	private TeachingTypeDTO teachingType;

	public TeacherOnRealizationDTO() {
	}

	public TeacherOnRealizationDTO(Long id, int numberOfClasses, TeacherDTO teacher,
			SubjectRealizationDTO subjectRealization, NotificationDTO notification, TeachingTypeDTO teachingType) {
		this.id = id;
		this.numberOfClasses = numberOfClasses;
		this.teacher = teacher;
		this.subjectRealization = subjectRealization;
		this.notification = notification;
		this.teachingType = teachingType;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getNumberOfClasses() {
		return numberOfClasses;
	}

	public void setNumberOfClasses(int numberOfClasses) {
		this.numberOfClasses = numberOfClasses;
	}

	public TeacherDTO getTeacher() {
		return teacher;
	}

	public void setTeacher(TeacherDTO teacher) {
		this.teacher = teacher;
	}

	public SubjectRealizationDTO getSubjectRealization() {
		return subjectRealization;
	}

	public void setSubjectRealization(SubjectRealizationDTO subjectRealization) {
		this.subjectRealization = subjectRealization;
	}

	public NotificationDTO getNotification() {
		return notification;
	}

	public void setNotification(NotificationDTO notification) {
		this.notification = notification;
	}

	public TeachingTypeDTO getTeachingType() {
		return teachingType;
	}

	public void setTeachingType(TeachingTypeDTO teachingType) {
		this.teachingType = teachingType;
	}
}
