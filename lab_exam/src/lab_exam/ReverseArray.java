package lab_exam;

import java.util.Scanner;

public class ReverseArray {
	static void display(int arr[]) {
		System.out.println("Array is :");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] +" ");
		}
		System.out.println(" ");
	}

	 static void rvereseArray(int arr[], int start, int end) 
	{ 
	    while (start < end) 
	    { 
	        int temp = arr[start];  
	        arr[start] = arr[end]; 
	        arr[end] = temp; 
	        start++; 
	        end--; 
	    }  
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number of element of the array:");
		int n=scn.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter element no "+ (i+1) +" ");
			int val=scn.nextInt();
			arr[i]=val;
		}
		System.out.println("Before reverse  :");
		display(arr);
		System.out.println("After reverse  :");
		rvereseArray(arr,0,n-1);
		display(arr);
		scn.close();
	}

}
