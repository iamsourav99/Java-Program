//use of super keyword

class Animal{
	void eat() {
		System.out.println("animal eating");
	}
	
}
class Dog extends Animal{
	void fight() {
		super.eat();
		System.out.println("dog is fighting");
	}
	
}
public class TestAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog A1 =new Dog();
		A1.fight();
		
	}

}
