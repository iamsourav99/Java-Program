class Vehicle{
	void run() {
		System.out.println("vehicle running");
	}
}
public class Bike extends Vehicle  {
	void run() {
		System.out.println("Bike running");
	}

	public static void main(String[] args) {
		Bike b=new Bike();
		b.run();
	}

}
