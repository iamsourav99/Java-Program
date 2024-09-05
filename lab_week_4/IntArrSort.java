package java_practice;
import java.util.Scanner;
public class IntArrSort {

	public static void main(String Args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elements of Array: ");
		int n = sc.nextInt();
		int arr [] = new int [n];
		System.out.println("Enter the elements of array: ");
		for (int i = 0; i<n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("\nDisplay before sorting: ");
		display(arr);
		sortArr(arr);
		System.out.println("\nDisplay After sorting: ");
		display(arr);
	}

	private static void sortArr(int[] arr) {
		for (int i = 0; i < arr.length; i++)
			for (int j = 1; j < arr.length; j++) {
				if (arr[j-1]<(arr[j])) {
					int temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;

				}
			}
		
	}

	private static void display(int[] arr) {
	for(int i = 0; i<arr.length; i++) {
		System.out.print(arr[i]+" ");
	}
	
		
	}

}
