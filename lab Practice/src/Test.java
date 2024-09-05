
public class Test {
	
	void add(int a,long b) {
		System.out.println(a+b);
	}
	void add(int a,int b, int c) {
		System.out.println(a+b+c);
	}

	public static void main(String[] args) {
		System.out.println("hello world");
		Test t=new Test();
		t.add(10,20); //type promotion applied 
		t.add(20, 100, 30);
	}

}

//type promotion in compile time polymorphism
//byte---short---integer--long---float---double
//char --integer --->>>>>>