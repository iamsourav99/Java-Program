import java.util.Scanner;

public class StringArrSort {

    public static void main(String Args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the Array: ");
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
        sc.close();
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
        int n = strArr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (strArr[j].compareTo(strArr[j + 1]) < 0) { 
                    String temp = strArr[j];
                    strArr[j] = strArr[j + 1];
                    strArr[j + 1] = temp;
                }
                else{

                }
            
            }
        }
    }
}