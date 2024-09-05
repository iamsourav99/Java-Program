
public class MultiTh2 implements Runnable {
	public void run() {
		System.out.println("thread is running");
	}
	public static void main(String[] args) {
		MultiTh2 m1=new MultiTh2();
		Thread t1=new Thread(m1);
		t1.start();
	}

}
