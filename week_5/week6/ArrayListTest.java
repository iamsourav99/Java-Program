import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al=new ArrayList<String>();
		al.add("Sourav");
		al.add("Bhaskar");
		al.add("abhi");
	Iterator<String> atr=al.iterator();
		while(atr.hasNext()){
		System.out.println(atr.next());
	}
//		for(String s:al) { // print arraylist using the foreach loop
//			System.out.println(s+" ");
//		}
	}

}
