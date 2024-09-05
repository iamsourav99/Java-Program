package p3;

public class Calculator {
	int add (int a,int b) {
		return (a+b);
	}
	int sub(int a, int b) {
		if (b>a) {
			throw new ArithmeticException("Second no is learge then first one !!");
		
		}return (a-b);
	}
	int mul (int a , int b) {
		int m = countDigits(a);
		int n = countDigits(b);
		if((m+n)>10) throw new ArithmeticException("both number are too learge ");
		return a*b;
	}
	
	int div(int a , int b) {
		if(b<=0) throw new ArithmeticException("Division either zero or negative");
		return a/b;
	}
	private int countDigits(int a) {
		int c = 0;
		if(a>0) {
			c=c+1;
			a=a/10;
		}
		return 0;
	}
//	public static void main(String[] args) {
//		
//
//	}

}
