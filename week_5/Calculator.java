package p2;

public class Calculator {
	int add(int a, int b) {
		return (a+b);
	}
	int sub(int a,int b) {
		if(b>a) 
			throw new ArithmeticException("Second number is larger than first one");
		
		return(a-b);
	}
	int mul(int a,int b) {
		int m=countDigits(a);
		int n=countDigits(b);
		if((m+n)>10) throw new ArithmeticException("Both the numbers are too large");
		return(a*b);
	}
	int div(int a,int b) {
		if(b<=0) throw new ArithmeticException("Division either zero or negative");
		return (a/b);
	}
	private int countDigits(int a) {
		int c=0;
		while(a>0) {
			c=c+1;
			a=a/10;
		}
		return 0;
	}
	
}
