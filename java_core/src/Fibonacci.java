//fibonacci series using recursion 
import java.util.Scanner;
public class Fibonacci {
	 static int n1=0, n2=1,n3; //instance variable 
	public static void fibo(int x){
		if(x>0) {
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.println("" +n3);
			fibo(x-1); //recursion method 
		}
	}
//main method 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the terms of fibonacci series:");
		int count=s.nextInt();
		s.close();
		System.out.println(n1);
		System.out.println(n2);
		fibo(count-2); //function call
		System.out.println("Fibonacci series of"+ count + "tems:" );
	}

}
