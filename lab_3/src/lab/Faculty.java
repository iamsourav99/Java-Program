package lab;

public class Faculty extends Employee {
	String OfficeHours;
	int rank;
	@Override
	public String toString() {
		return "Faculty [OfficeHours=" + OfficeHours + ", rank=" + rank + ", name=" + name + "]";
	}
	
}
