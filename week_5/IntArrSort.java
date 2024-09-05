import java.util.Scanner;

public class IntArrSort {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number of element in the array:");
		int n=scn.nextInt();
		int intArr[]=new int[n];
		System.out.println("enter the element of the array:");
		for(int i=0;i<n;i++) {
			System.out.println("Enter element "+i+1 );
			int s=scn.nextInt();
			intArr[i]=s;
		}
		System.out.println("Display Before sorting");
		display(intArr);
		sort(intArr);
		System.out.println("Display after sorting");
		display(intArr);
		scn.close();
	}

	private static void sort(int[] intArr) {
		// TODO Auto-generated method stub
		for(int i=0;i<intArr.length;i++) {
			for(int j=1;j<intArr.length;j++) {
				if(intArr[j-1]<intArr[j]) {
					int temp=intArr[j];
					intArr[j]=intArr[j-1];
					intArr[j-1]=temp;
				}
			}
		}
	}

	private static void display(int[] intArr) {
		// TODO Auto-generated method stub
		for(int i:intArr) {
			System.out.println(i+" ");
		}
	}

}
