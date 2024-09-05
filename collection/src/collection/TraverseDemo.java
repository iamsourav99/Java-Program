package collection;

import java.util.*;
import java.util.stream.*;

public class TraverseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l1= List.of("apple","banana","mango"); //using of() -- collection factory
		//ways of traversing /Iterating
		//using for loop
		for( int i=0;i<l1.size();i++) {
			System.out.println(l1.get(i));
		}
		//using enhance for loop
		for(String s:l1) {
			System.out.println(s);
		}
		//using for each() loop
	l1.forEach(s->System.out.println(s));
	//without storing into a variable
	l1.forEach(System.out::println);
	
	//creating stream using list
	Stream <String> st1=l1.stream();
	st1.forEach(System.out::println);
	//creating stream using set
	Set<String> set1=new HashSet<String>(l1);
	Stream<String> st2=set1.stream();
	st2.forEach(System.out::println);
	//creating stream using array
	String strArray[]= {"xxx","yyy","zzz"};
	Stream<String> st3=Arrays.stream(strArray);
	st3.forEach(System.out::println);
	//creating stream using linkedlist 
	}

}
