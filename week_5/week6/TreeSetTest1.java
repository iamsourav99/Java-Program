package P1;

import java.util.TreeSet;

public class TreeSetTest1 {

	public static void main(String[] args) {
		TreeSet<String> ts=new TreeSet<String>();
		ts.add("sourav");
		ts.add("bhaskar");
		ts.add("gopal");
		ts.add("sourav");
		
		for(String s:ts) {
			System.out.print(s+" "); //print in Acending order
		}
	}

}
