// Reverse an array

package arrays;

public class P04_2 {
	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5};
		int n = arr.length;
		
		reverseArray(arr,n);
		System.out.println();
		
		reverseArray2(arr,n);
		System.out.println();
		
		reverseArray3(arr, 0, n-1);
		printArray(arr, n);
		
	}
	
	
	
	// Sol-1: Using an extra array
	static void reverseArray(int arr[], int n) {
		
		int rev_arr[] = new int[n];				// new array to store reversed arrays
		
		for(int i=n-1; i>=0; i--)
			rev_arr[n-i-1] = arr[i];
		
		printArray(rev_arr, n);
	}
	
	
	
	// Sol-2: Space-optimized iterative method
	static void reverseArray2(int arr[], int n) {
		
		int start = 0, end = n-1;
		
		while(start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		
		printArray(arr, n);
	}
	
	
	
	// Sol-3: Recursive method
	// Here array will be arr={5,4,3,2,1} because of previous method
	
	static void reverseArray3(int arr[], int start, int end) {
		
		if(start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			reverseArray3(arr, start+1, end-1);
		}
		
	}
	
	
	// Printing array
	static void printArray(int arr[], int n) {
		
		for(int a : arr)
			System.out.print(a + " ");
	}

}
