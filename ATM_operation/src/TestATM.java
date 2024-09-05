import java.util.Scanner;

public class TestATM {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Account No:");
		String acNo = scn.nextLine();
		System.out.println("Enter initial balance:");
		double bl = scn.nextDouble();
		Bank_Account userAccount = new Bank_Account(acNo, bl);
		ATM atm = new ATM(userAccount);
		while (true) {
			atm.mainMenu();
			double amount;
			int ch = scn.nextInt();
			switch (ch) {
			case 1:
				atm.checkBalance();
				break;
			case 2:
				System.out.println("Enter the amount to deposit:");
				amount = scn.nextDouble();
				atm.deposit(amount);
				break;
			case 3:
				System.out.println("Enter the amount to withdraw:");
				amount = scn.nextDouble();
				atm.withdraw(amount);
				break;
			case 4:
				System.out.println("Thankyou for using our service ");
				System.exit(0);
				break;
			default:
				System.out.println("Invalid choice!!!!!");
				break;
			}

		}
	}

}
