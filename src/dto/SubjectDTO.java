package dto;

public class SubjectDTO {
	private Long id;
	private String name;
	private int ects;
	private boolean compulsory;
	private int numberOfClasses;
	private int numberOfPractices;
	private int otherTypesOfClasses;
	private int researchWork;
	private int classesLeft;
	private int numberOfSemesters;
	private YearOfStudyDTO yearOfStudy;
	private AftermathDTO aftermath;
	private SubjectDTO prerequisite;

	public SubjectDTO() {
	}

	public SubjectDTO(Long id, String name, int ects, boolean compulsory, int numberOfClasses, int numberOfPractices,
			int otherTypesOfClasses, int researchWork, int classesLeft, int numberOfSemesters,
			YearOfStudyDTO yearOfStudy, AftermathDTO aftermath, SubjectDTO prerequisite) {
		this.id = id;
		this.name = name;
		this.ects = ects;
		this.compulsory = compulsory;
		this.numberOfClasses = numberOfClasses;
		this.numberOfPractices = numberOfPractices;
		this.otherTypesOfClasses = otherTypesOfClasses;
		this.researchWork = researchWork;
		this.classesLeft = classesLeft;
		this.numberOfSemesters = numberOfSemesters;
		this.yearOfStudy = yearOfStudy;
		this.aftermath = aftermath;
		this.prerequisite = prerequisite;
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

	public int getEcts() {
		return ects;
	}

	public void setEcts(int ects) {
		this.ects = ects;
	}

	public boolean isCompulsory() {
		return compulsory;
	}

	public void setCompulsory(boolean compulsory) {
		this.compulsory = compulsory;
	}

	public int getNumberOfClasses() {
		return numberOfClasses;
	}

	public void setNumberOfClasses(int numberOfClasses) {
		this.numberOfClasses = numberOfClasses;
	}

	public int getNumberOfPractices() {
		return numberOfPractices;
	}

	public void setNumberOfPractices(int numberOfPractices) {
		this.numberOfPractices = numberOfPractices;
	}

	public int getOtherTypesOfClasses() {
		return otherTypesOfClasses;
	}

	public void setOtherTypesOfClasses(int otherTypesOfClasses) {
		this.otherTypesOfClasses = otherTypesOfClasses;
	}

	public int getResearchWork() {
		return researchWork;
	}

	public void setResearchWork(int researchWork) {
		this.researchWork = researchWork;
	}

	public int getClassesLeft() {
		return classesLeft;
	}

	public void setClassesLeft(int classesLeft) {
		this.classesLeft = classesLeft;
	}

	public int getNumberOfSemesters() {
		return numberOfSemesters;
	}

	public void setNumberOfSemesters(int numberOfSemesters) {
		this.numberOfSemesters = numberOfSemesters;
	}

	public YearOfStudyDTO getYearOfStudy() {
		return yearOfStudy;
	}

	public void setYearOfStudy(YearOfStudyDTO yearOfStudy) {
		this.yearOfStudy = yearOfStudy;
	}

	public AftermathDTO getAftermath() {
		return aftermath;
	}

	public void setAftermath(AftermathDTO aftermath) {
		this.aftermath = aftermath;
	}

	public SubjectDTO getPrerequisite() {
		return prerequisite;
	}

	public void setPrerequisite(SubjectDTO prerequisite) {
		this.prerequisite = prerequisite;
	}
}
