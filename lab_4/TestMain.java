package lab_4;
import java.util.Scanner;
public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s=new Scanner(System.in);
		 System.out.println("Enter the number of Student:");
		 int n=s.nextInt();
		 Student stuArr[] =new Student[n];
		 for(int i=0;i<stuArr.length;i++) {
			 System.out.println("Enter student details "+(i+1));
			 System.out.println("Enter rollno");
			 int roll=s.nextInt();
			 System.out.println("Enter name:");
			 String name=s.next();
			 System.out.println("Enter Marks:");
			 double marks=s.nextDouble();
			 Student st=new Student(roll,name,marks);
			 stuArr[i]=st;
		 }
		 //operation of main class
		 System.out.println("Diaplay Student array before sorting:");
		 display(stuArr);
		 sortByName(stuArr);
		 System.out.println("Diaplay student array after sorted by name :");
		 display(stuArr);
		 sortByMarks(stuArr);
		 System.out.println("Display student array after sorted by marks:");
		 display(stuArr);
		 s.close();
	}
	//sort by name method
	private static void sortByName(Student[] stuArr) {
		int n=stuArr.length;
		for(int i=0;i<=n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(stuArr[j].getName().compareTo(stuArr[j+1].getName())>0) {
					Student temp=stuArr[j];
					stuArr[j]=stuArr[j+1];
					stuArr[j+1]=temp;
				}
			}
		}
	}

		//sort by marks method
	private static void sortByMarks(Student[] stuArr) {
		int n=stuArr.length;
		for(int i=0;i<=n-1;i++) {
			for(int j=0;j<=n-i-1;j++) {
				if(stuArr[j].getMarks()>stuArr[j+i].getMarks()) {
					Student temp=stuArr[j];
					stuArr[j]=stuArr[j+1];
					stuArr[j+1]=temp;
				}
			}
		}
	}
	//display method
	private static void display(Student[] stuArr) {
		for(Student s:stuArr) {
			System.out.println(s);
		}
	}

}
