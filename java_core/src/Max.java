//find the largest and smallest element of an array
public class Max {

	static void max(int arr[]) {
		int max=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
	
			}
		}
		System.out.println("max:"+max);
		
	}
	static void min(int arr[]) {
		int min=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println("min:"+min);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,55,23,24,7};// array decleration,instanstion,initialization
		max(arr);
		min(arr);
	}

}
