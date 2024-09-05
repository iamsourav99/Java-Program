
public class MatrixOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arrA[][]= {{1,2,3},{1,2,3},{1,2,3}};
		int arrB[][]= {{4,5,6},{4,5,6},{4,5,6}};
		int arrC[][]=new int[3][3];
		int arrD[][]=new int[3][3];
		addition(arrA,arrB,arrC);
		System.out.println("Display Array A");
		display(arrA);
		System.out.println("Display Array B");
		display(arrB);
		System.out.println("Display Array C after Addition");
		display(arrC);
		System.out.println("Display Array D after Multiplication ");
		mul(arrA,arrB,arrD);
		display(arrD);
	}

	private static void mul(int[][] arrA, int[][] arrB, int[][] arrD) {
		// TODO Auto-generated method stub
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				arrD[i][j]=0;
				for(int k=0;k<3;k++) {
					arrD[i][j]+=arrA[i][k]*arrB[k][j]; 
				}
			 
			}
		}
		
	}

	private static void display(int[][] arr) {
		// TODO Auto-generated method stub
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(arr[i][j]+" ");
			 
			}
			System.out.println( );
		}
	}

	private static void addition(int[][] arrA, int[][] arrB, int[][] arrC) {
		// TODO Auto-generated method stub
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				
			 arrC[i][j]=arrA[i][j]+arrB[i][j];
			}
		}
		
	}

}
