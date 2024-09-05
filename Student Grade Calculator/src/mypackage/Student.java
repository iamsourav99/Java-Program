package mypackage;

public class Student {
	private String name;
	private int rollNo;
	private int marks[];
	private int totalMarks;
	private double averagePercentage;
	private String grade;

	public int getTotalMarks() {
		return totalMarks;
	}

	public void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
	}

	public double getAveragePercentage() {
		return averagePercentage;
	}

	public void setAveragePercentage(double averagePercentage) {
		this.averagePercentage = averagePercentage;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public Student(String name, int rollNo, int[] marks) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public int[] getMarks() {
		return marks;
	}

	public void setMarks(int[] marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "[totalMarks=" + totalMarks + ", averagePercentage=" + averagePercentage + ", grade=" + grade + "]";
	}

}
