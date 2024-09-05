package collection;
import java.util.*;
import java.util.stream.*;
class Student{
	int roll;
	String name;
	double Percentage;
	public Student(int roll, String name, double percentage) {
		super();
		this.roll = roll;
		this.name = name;
		Percentage = percentage;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return " [roll=" + roll + ", name=" + name + ", Percentage=" + Percentage + "]";
	}
	
}
public class TestStudent {

	public static void main(String[] args) {
	List<Student> st=new ArrayList<Student>();
//	st.add(new Student(101,"sourav",85));
//	st.add(new Student(102,"rahul",95));
//	st.add(new Student(103,"abhi",68));
//	st.forEach(System.out::println);
	
	}

}
