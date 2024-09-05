package WrapperClass;

public class TestAutoboxing {

	public static void main(String[] args) {
		int i=10;
		Integer a=Integer.valueOf(i); //before java 5.0
		Integer b=i;
		
		
		System.out.println(a);
		System.out.println(b);
	}

}
