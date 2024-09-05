package P1;

import java.util.ArrayList;

public class ArrayListTest2 {

	public static void main(String[] args) {
		ArrayList<Student> al=new ArrayList<Student>();
		al.add(new Student(101,"Sourav",65.6));
		al.add(new Student(102,"bhaskar",85.6));
		al.add(new Student(103,"gopal",68.6));
		for(Student stu:al) {
			System.out.println(stu);
		}
	}

}
