package java_core;

abstract class Abstruction{
	
	abstract  void run();
}
public class TestAbstruction extends Abstruction{

	void run(){
		System.out.println("Runnning");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abstruction a=new TestAbstruction();
		a.run();
	}

//	@Override
//	void run() {
//		// TODO Auto-generated method stub
//System.out.println("running");
	}


