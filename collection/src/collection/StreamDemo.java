package collection;
import java.util.*;
import java.util.stream.*;
class Product{
	int id;
	String name;
	double price;
	Product(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return " [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
}
public class StreamDemo {

	public static void main(String[] args) {
		
		List<Product> list1=getProducts();
		//filtering
		for(Product p:list1) {
			System.out.println(p);
			} 
	
		//using stream API	
		List<Product> l2=getProducts().stream().filter((prod) -> prod.price>1000).collect(Collectors.toList());
		l2.forEach(System.out::println);
		}

	private static List<Product> getProducts()
	{
		Scanner sc=new Scanner(System.in);
		List<Product> pList=new ArrayList<Product>();
		System.out.println("Enter number of student");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.println("Enter student details"+ " "+i);
			int id=sc.nextInt();
			String name=sc.next();
			double price=sc.nextDouble();
			pList.add(new Product(id,name,price));
			
		}
		return pList;
//		pList.add(new Product(101,"desktop",1002));
//		pList.add(new Product(102,"laptop",152000));
//		pList.add(new Product(103,"mouse",100));
//		return pList;
		
	}
}
