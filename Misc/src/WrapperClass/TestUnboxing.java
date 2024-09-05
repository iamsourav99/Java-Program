package WrapperClass;

public class TestUnboxing {

	@SuppressWarnings("removal")
	public static void main(String[] args) {
		Integer i= new Integer(3);
		int a=i; //latest features
		int b=i.intValue(); // since java 5.0 we dint have to use it 
		System.out.println("a="+a+" "+"b="+b);
	}

}
