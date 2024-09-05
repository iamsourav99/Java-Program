
/**
 * @author Sourav_Barman
 * <h1>Number Guess Game</h1>
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberGameExample {

	static boolean play = false;
	static int count = 0;
	static int num;
	static Scanner scn = new Scanner(System.in);
	static int guessNum;

	public static void main(String[] args) {

		guessNum();
		gamePlay();
		System.out.println("Score= " + gameScore(count));
		reAttemptCheck();

	}

//method reAttemptCheck
	private static void reAttemptCheck() {
		String reAttempt = "yes";
		boolean attempt=false;
		String response;
		while (!attempt) {
			
			try {
				System.out.println();
				System.out.println("****Do you want to play again****");
				System.out.println("yes/no");
			 response = scn.next();
				if (response.equals(reAttempt)) {
					play = false;
					count = 0;
					guessNum();
					gamePlay();
					System.out.println("Score= " + gameScore(count));
				}
				else if(response.equals("no")){
					System.out.println("Game Exit");
					attempt=true;
				}
				else {
					throw new IllegalAccessException("Please enter correct keyword");
				}
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
		}

	}

//method random number guess
	private static void guessNum() {
		int min = 1, max = 100;
		double random = Math.random() * (max - min + 1) + min;
		guessNum = (int) Math.floor(random);
		System.out.println("Guess Number is:" + guessNum);

	}

//method gameplay()
	private static void gamePlay() {
		System.out.println("Max No of Attempts:5");

		while (!play) {

			try {
				System.out.println("Attempt No:" + (count + 1));
				System.out.print("Please guess a number b/w 1 to 100 :");
				num = scn.nextInt();
				if (num >= 100 || num <= 0) {
					throw new IllegalArgumentException("number should be in range of 1 to 100");
				} else if (num == guessNum) {
					System.out.println("You Win");
					play = true;
				} else if (num > guessNum) {
					System.out.println("Too HIgh Input");
				} else {
					System.out.println("Too Low Input");
				}
			} catch (InputMismatchException e) {
				System.out.println("[Invalid Input]-->please enter positive  number only");
				scn.next();
				count--;
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
				count--;
			}

			count++;
			if (num != guessNum) {
				if (count == 5) {
					System.out.println("You Failed, Please try again");

					play = true;
					count++;
				}

			}

		}

	}
//method score
	private static int gameScore(int count2) {
		int sc = 0;
		switch (count2) {
		case 1:
			sc = 100;
			break;
		case 2:
			sc = 80;
			break;
		case 3:
			sc = 60;
			break;
		case 4:
			sc = 40;
			break;
		case 5:
			sc = 20;
			break;
		default:
			sc = 0;
			break;
		}
		return sc;
	}
}
