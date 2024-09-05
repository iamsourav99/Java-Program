/**
 * @author sourav barman
 */
package invalid_Exception;

import java.util.Scanner;

public class TestException {
	static Scanner sc = new Scanner(System.in);

	public static void main(String Args[])  {

		try {
			userInput();
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("Program Done");
			sc.close();
		}

	}

//method userInput()
	public static void userInput() throws InvalidAgeException {
		System.out.println("Enter Your Age: ");
		int n = sc.nextInt();

		if (n < 18 || n > 60) {
			throw new InvalidAgeException("Invalid age");
		}
		System.out.println("You are eligible for Online vote");

	}
}
