package p2;
import java.util.Scanner;
public class TestException {
	public static void main(String Args [])throws InvalidAgeException {
		
		try {
			userInput();
		}catch(Exception e) {
			System.out.println("");
		}
		
		
		
	}
	public static void userInput throw Invalid{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Age: ");
		int n = sc.nextInt();
		if(n<18 || n>60) {
			throw new InvalidAgeException("Invalid age ")
		}
		sc.close();
	}
}
