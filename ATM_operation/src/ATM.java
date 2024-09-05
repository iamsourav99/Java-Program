
public class ATM {
	public Bank_Account bank_account;

	public ATM(Bank_Account bank_account) {
		super();
		this.bank_account = bank_account;
	}

	public void deposit(double amount) {
		if (amount > 0) {
			bank_account.accountBalance += amount;
			System.out.println("Transcation Successfull");
			checkBalance();
		} else {
			System.out.println("Deposit can't be done");
		}

	}

	public void withdraw(double amount) {
		if (amount < bank_account.accountBalance) {
			bank_account.accountBalance -= amount;
			System.out.println("Transcation Successfull");
			checkBalance();
		} else {
			System.out.println("Insufficient balance ");
		}
	}

	public void checkBalance() {
		System.out.println("Your account balance is:" + this.bank_account.accountBalance);

	}

	public void mainMenu() {
		System.out.println("ATM Interface");
		System.out.println("1.Check Balance");
		System.out.println("2.Deposit");
		System.out.println("3.Withdraw");
		System.out.println("4.Exit");
		System.out.println("*****Enter yout choice*****");
	}
}
