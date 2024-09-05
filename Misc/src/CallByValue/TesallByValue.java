package CallByValue;

public class TesallByValue {
 int i=10;
 void change(int i) {
	 i+=100;
	 System.out.println("Value from method:"+i);
 }
	public static void main(String[] args) {
		TesallByValue obj=new TesallByValue();
		System.out.println("Before Calling method:"+obj.i);
		obj.change(100);
		System.out.println("After Calling mehod:"+ obj.i);
	}

}
