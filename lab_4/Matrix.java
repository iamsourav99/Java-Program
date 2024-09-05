package lab_4_2;
import java.util.Scanner;
public class Matrix {
	
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Size of first matrix:");
		int m=s.nextInt();
		int n=s.nextInt();
		System.out.println("Enter the Size of Second matrix:");
		int p=s.nextInt();
		int q=s.nextInt();
		int matrixA[][]=new int[m][n];
		int matrixB[][]=new int[p][q];
		System.out.println("Enter Data for Matrix_A");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.println("Enter element"+i+" "+j+": ");
				int data=s.nextInt();
				matrixA[i][j]=data;
			}
		}
		System.out.println("Enter Data for Matrix_B");
		for(int i=0;i<p;i++) {
			for(int j=0;j<q;j++) {
				System.out.println("Enter element"+i+" "+j+": ");
				int data=s.nextInt();
				matrixB[i][j]=data;
			}
		}
		
//		display(matrixA);
		multiplyMatrix(m,n,matrixA,p,q,matrixB);
		s.close();
	}

//	private static void display(int[][] matrixA) {
//	for(int x[]: matrixA) {
//		System.out.println(x);
//			
//		}

//	}
	static void printMatrix(int M[][], int rowSize,int colSize)
	{
		for (int i = 0; i < rowSize; i++) {
			for (int j = 0; j < colSize; j++)
				System.out.print(M[i][j] + " ");

			System.out.println();
		}
	}
	
	
static void multiplyMatrix(int m, int n,int matrixA[][], int p,int q, int matrixB[][])
{
int i, j, k;

// Print the matrices A and B
System.out.println("\nMatrix A:");
printMatrix(matrixA, m, n);
System.out.println("\nMatrix B:");
printMatrix(matrixB, p, q);

// Check if multiplication is Possible
if (p != n) {

System.out.println(
"\nMultiplication Not Possible");
return;
}

// Matrix to store the result
// The product matrix will
// be of size row1 x col2
int matrixC[][] = new int[m][q];

// Multiply the two matrices
for (i = 0; i < m; i++) {
for (j = 0; j < q; j++) {
for (k = 0; k < p; k++)
	matrixC[i][j] += matrixA[i][k] * matrixB[k][j];
}
}

// Print the result
System.out.println("\nResultant Matrix:");
printMatrix(matrixC, m, q);
}
}
