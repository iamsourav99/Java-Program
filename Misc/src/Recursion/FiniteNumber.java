package Recursion;

public class FiniteNumber {
	 static int count=0;
	public static void show() {
		count ++;
		if(count<=10) {
			System.out.println(count);
			show();
		}
	}

	public static void main(String[] args) {
		show();
	}

}
