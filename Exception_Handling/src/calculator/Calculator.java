package calculator;

public class Calculator {
	int add(int a, int b) {
		return (a + b);
	}

	int sub(int a, int b) {
		if (b > a) {
			throw new ArithmeticException("Second number is learge then first one !!");

		}
		return (a - b);
	}

	int mul(int a, int b) {
		int m = countDigits(a);
		int n = countDigits(b);
		if ((m + n) > 10)
			throw new ArithmeticException("both number are too learge ");
		return a * b;
	}

	int div(int a, int b) {
		if (b <= 0)
			throw new ArithmeticException("Division by either zero or negative");
		return a / b;
	}
//method countDigits for to find the digits of input numbers
	private int countDigits(int a) {
		int c = 0;
		if (a > 0) {
			c = c + 1;
			a = a / 10;
		}
		return 0;
	}
}
