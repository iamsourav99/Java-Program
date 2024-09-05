import java.util.Scanner;
public class StringArrSort {
	
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number of element in the array:");
		int n=scn.nextInt();
		String strArr[]=new String[n];
		System.out.println("enter the element of the array:");
		for(int i=0;i<n;i++) {
			System.out.println("Enter element "+i+1 );
			String s=scn.next();
			strArr[i]=s;
		}
		System.out.println("Display Before sorting");
		display(strArr);
		sort(strArr);
		System.out.println("Display after sorting");
		display(strArr);
		scn.close();
	}

	private static void sort(String[] strArr) {
		for(int i=0;i<strArr.length;i++) {
			for(int j=1;j<strArr.length;j++) {
				
				if(strArr[j-1].compareTo(strArr[j])>0) {
					String temp=strArr[j-1];
					strArr[j-1]=strArr[j];
					strArr[j]=temp;
				}
			}
		}
		
	}

	private static void display(String[] strArr) {
		for(String s:strArr) {
			System.out.print(s +" ");
		}
		System.out.println();
		
	}

}
