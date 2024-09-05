package calculator;

import java.util.Scanner;

public class TestCalculator {
	public static void main(String args[]) {
		Calculator cal = new Calculator();
		String op = "yes";
		Scanner sc = new Scanner(System.in);
		while (op.equals("yes")) {
			System.out.println("Enter operation name \n option: add, sub, mul, div");
			String opname = sc.next();
			System.out.println("Enter two operand: ");
			int a = sc.nextInt();
			int b = sc.nextInt();

			switch (opname) {
			case "add":
				try {
					System.out.println("result: " + cal.add(a, b));
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;
			case "sub":
				try {
					System.out.println("result: " + cal.sub(a, b));
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;
			case "mul":
				try {
					System.out.println("result: " + cal.mul(a, b));
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;
			case "div":
				try {
					System.out.println("result: " + cal.div(a, b));
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;

			}
		}
	}
}
