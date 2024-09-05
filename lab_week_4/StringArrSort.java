package java_practice;

import java.util.Scanner;

public class StringArrSort {

	public static void main(String Args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num of elements in the Array: ");
		int n = sc.nextInt();
		String strArr[] = new String[n];
		System.out.println("Enter the elements of Array: ");
		for (int i = 0; i < n; i++) {
			String s = sc.next();
			strArr[i] = s;

		}
		System.out.println("Display Before Sorting: ");
		display(strArr);
		System.out.println("Display after sorting: ");
		sortArr(strArr);
		display(strArr);
	}

	// display method
	private static void display(String[] strArr) {
		for (int i = 0; i < strArr.length; i++) {
			System.out.print(strArr[i] + " ");
		}
		System.out.println();

	}

	// sorting method
	private static void sortArr(String[] strArr) {
		for (int i = 0; i < strArr.length; i++)
			for (int j = 1; j < strArr.length; j++) {
				if (strArr[j-1].compareTo(strArr[j]) > 0) {
					String temp = strArr[j-1];
					strArr[j-1] = strArr[j];
					strArr[j] = temp;

				}
			}

	}
}
