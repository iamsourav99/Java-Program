import java.util.Scanner;

public class Ex_1 {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		System.out.println("Enter a number:");
		int a=scn.nextInt();
		System.out.println("Enter another  number:");
		int b=scn.nextInt();
		scn.close();
		try {
			int c=a/b;
			System.out.println("Result:"+c);
		}catch (ArithmeticException e) {
			System.out.println(e);
		}

	}

}
