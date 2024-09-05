

public class Error {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c;
		//error handling with simple try-catch 
		try {
			int a =Integer.parseInt(args[0]);
			int b =Integer.parseInt(args[1]);
			c = a/b;
			System.out.println("Result:"+c);
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // if value of b is 0 then run time -error occur
		
	}

}
