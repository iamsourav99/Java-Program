package lab_exam;

import java.util.Scanner;

public class BubbleSort {
	static void display(int arr[]) {
		System.out.println("Array is :");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] +" ");
		}
		System.out.println(" ");
	}
	static void bubbleSort(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			for(int j=1;j<arr.length;j++) {
				if (arr[j - 1] > (arr[j])) {
					int temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
			}
		}
	}
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number of element of the array:");
		int n=scn.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter element no "+ (i+1) +": ");
			int val=scn.nextInt();
			arr[i]=val;
		}
		System.out.println("Before sorting array is:");
		display(arr);
		System.out.println("After sorting array is:");
		bubbleSort(arr);
		display(arr);
		scn.close();

	}

}
