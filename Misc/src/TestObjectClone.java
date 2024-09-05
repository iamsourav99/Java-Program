
public class TestObjectClone  implements Cloneable{
	int roll_no;
	String name;
	

	public TestObjectClone(int roll_no, String name) {
		super();
		this.roll_no = roll_no;
		this.name = name;
	}


	
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			TestObjectClone obj1=new TestObjectClone(101,"sourav");
			TestObjectClone obj2=(TestObjectClone)obj1.clone();
			System.out.println(obj1.roll_no+" "+ obj1.name);
			System.out.println(obj2.roll_no+" "+obj2.name);
		} catch (CloneNotSupportedException c) {
			// TODO Auto-generated catch block
		System.out.println(c);
		}
	}

}
