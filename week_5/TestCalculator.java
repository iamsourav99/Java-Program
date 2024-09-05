package p2;

import java.util.Scanner;

public class TestCalculator {

	public static void main(String[] args) {
		String op="yes";
		Scanner scn=new Scanner(System.in);
		Calculator cal=new Calculator();
		while(op.equals("yes")) {
			System.out.println("Enter operation name option. add,sub.mul,div");
			String opname=scn.next();
			System.out.println("Enter two operands");
			System.out.println("Enter first number:");
			int a=scn.nextInt();
			System.out.println("Enter Second number:");
			int b=scn.nextInt();
			switch(opname) {
			case "add":
				try {
					System.out.println("Result="+cal.add(a, b)); 
				}catch (Exception e) {
					// TODO: handle exception
					System.out.println(e.getMessage());
				}
				break;
			case "sub":
				try {
					System.out.println("Result="+cal.sub(a, b)); 
				}catch (Exception e) {
					// TODO: handle exception
					System.out.println(e.getMessage());
				}
				break;
			case "mul":
				try {
					System.out.println("Result="+cal.mul(a, b)); 
				}catch (Exception e) {
					// TODO: handle exception
					System.out.println(e.getMessage());
				}
				break;
			case "div":
				try {
					System.out.println("Result="+cal.div(a, b)); 
				}catch (Exception e) {
					// TODO: handle exception
					System.out.println(e.getMessage());
				}
				break;
			}
			
		}
	}

}
