package p2;

import java.util.TreeSet;



public class TreeSetTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<p2.Student> al=new TreeSet<p2.Student>();
		al.add(new Student(101,"Sourav",65.6));
		al.add(new Student(102,"bhaskar",85.6));
		al.add(new Student(103,"gopal",68.6));
		for(Student stu:al) {
			System.out.println(stu);
		
	}

}
}
