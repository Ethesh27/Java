//Delete an element from an array

package arrays;

public class P13_2 {
	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5};
		int n = arr.length;
		int loc = 3;
		
		deleteElem(arr, n, loc);
	}
	
	
	static void deleteElem(int arr[], int n, int loc) {
		
		for(int i=loc; i<n-1; i++)
			arr[i] = arr[i+1];
		
		n--;
		
		printArray(arr, n);
	}
	
	
	static void printArray(int arr[], int n) {
		for(int i=0; i<n; i++)
			System.out.print(arr[i] + " ");
	}

}
