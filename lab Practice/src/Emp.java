class Person{
	int id;
	String name;
	Person(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
}
public class Emp extends Person{
	float salary;
	Emp(int id, String name,float salary){
		super(id,name);//re
		this.salary=salary;
	}
	

@Override
	public String toString() {
		return "Emp [salary=" + salary + ", id=" + id + ", name=" + name + "]";
	}


void display() {
	System.out.println(id+ " "+name+ " "+salary);
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp e =new Emp(101,"sou",50000);
	System.out.println(e);
	e.display();
	}

}
