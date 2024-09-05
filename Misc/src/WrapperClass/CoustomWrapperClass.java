package WrapperClass;
class Coustom{
	private int i;

	public Coustom() {
		super();
	}

	public Coustom(int i) {
		super();
		this.i = i;
	}

	@Override
	public String toString() {
		return Integer.toString(i);
	}
	
}
public class CoustomWrapperClass {

	public static void main(String[] args) {
		Coustom C=new Coustom(10);
		System.out.println(C);
	}

}
