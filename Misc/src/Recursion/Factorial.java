package Recursion;

import java.util.Scanner;

public class Factorial {
	static int factorial(int n) {
		if (n == 1)
			return 1;
		else
			return n * factorial(n - 1); // method calling itself
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int a = 0;
		boolean x = true;
		while (x) {

			try {
				System.out.println("Enter any number:");
				a = scn.nextInt();
				if (a == 0) {
					throw new IllegalArgumentException("Factorial of 0 not possible please enter positive integer");
				}
				System.out.println("Factorial of " + a + "is: " + factorial(a));
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());

			} finally {
				scn.close();
			}
		}
//		factorial(a)
	}

}
