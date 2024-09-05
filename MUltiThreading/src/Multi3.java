
public class Multi3 implements Runnable{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Runnable  m1=new Multi3();
		Thread t1=new Thread(m1);
		Thread t2=new Thread(m1);
		System.out.println(Thread.currentThread().getName());  //print the main thread
		t1.start();
		t1.join(); //join method invoked 
		t2.start();
//		System.out.println(t1.getName()); // its return the name of the reference Thread
//		System.out.println(t2.getName());
		
		
	}

	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			
			System.out.println(Thread.currentThread().getName()+" is running");
		
//			try {
//				
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}
	

}
}
