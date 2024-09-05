package p2;

public class Student1 implements Comparable<Student1> {
	private int id;
	private String name;
	private double marks;

	public Student1(int id, String name, double marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) { // to disable write
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}

	@Override
	public int compareTo(Student1 o) {
		if (marks > o.marks) {
			return 1;
		} else if (marks < o.marks) {
			return -1;
		} else {

			return 0;
		}
	}

}