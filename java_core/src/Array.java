import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*****Array creation******");
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Size of the array:");
		int n = s.nextInt();
		int arr[]; // declaration
		arr = new int[n];// instantiation
		// initialization
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter element " + i + " ");
			int val = s.nextInt();
			arr[i] = val; //
		}
		System.out.print("Entered Array:");
		for (int x : arr) {
			System.out.print(x + " ");
		}
		s.close();
	}

}
