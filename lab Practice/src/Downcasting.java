class A{
	
}
public class Downcasting extends A {
	static void x(A a) {
		if (a instanceof Downcasting) {
			Downcasting d = (Downcasting) a; //downcasting 
			System.out.println("downcasating done");
		}
	}

	public static void main(String[] args) {
		A a=new Downcasting();
		Downcasting.x(a);
	}

}
