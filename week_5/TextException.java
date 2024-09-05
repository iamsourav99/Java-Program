package p;

import java.util.Scanner;

public class TextException {

	public static void main(String[] args) throws InValid {
		try {
			
			userInput();
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	

	private static void userInput() throws InValid {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter your age:");
		int n=scn.nextInt(); 
		if(n<18 || n>60) {
			throw new InValid("Invalid Age: Age eithe less 18 or greater then 60");
		
	}
		scn.close();

}
}
