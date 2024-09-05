import java.lang.Thread;
class ThreadA extends Thread{
	public void run(){
		System.out.println("ThreadA is running");
	}
	
}
class ThreadB extends Thread{
	public void run(){
		System.out.println("ThreadB is running");
	}
	
}
public class ThreadsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadA T1=new ThreadA();
		ThreadB T2=new ThreadB();
		T1.start();
		T2.start();
		System.out.println("Mulithreading is over");
	}

}
