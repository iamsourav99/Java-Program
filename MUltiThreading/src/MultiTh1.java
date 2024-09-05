
public class MultiTh1 extends Thread{
	
	public void run() {
		System.out.println("thread running");
	}

	public static void main(String[] args) {
	
		MultiTh1 m1=new MultiTh1();
		m1.start();
		Thread t=new Thread("2nd Thread ");
		t.start();
		String str=t.getName();
		System.out.println(str);
		
	}

}
