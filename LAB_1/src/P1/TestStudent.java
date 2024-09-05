package P1;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st1=new Student(101,"Sourav",65.3);
		Student st2=new Student(102,"Bharkar",95.36);
		Student st3=new Student(103,"Rahul",78.3);
		Student st4=st2;
		System.out.println(st1);
		System.out.println(st2);
		System.out.println(st3);
		System.out.println(st4);
	}

}
