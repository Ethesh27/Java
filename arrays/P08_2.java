// Left Rotate array by 'k' place

package arrays;

public class P08_2 {
	public static void main(String[] args) {
		
		System.out.println("Left Rotate Brute Force");
		
		int arr[] = {1,2,3,4,5};
		int n = arr.length;
		int k = 3;
		leftRotate(arr, n, k);
		
		
		System.out.println("Left Rotate Optimal");
		
		int arr2[] = {1,2,3,4,5,6};
		int n2 = arr2.length;
		int k2 = 2;
		leftRotate2(arr2, n2, k2);
		
		
		System.out.println("Right Rotate Optimal");
		
		int arr3[] = {1,2,3,4,5};
		int n3 = arr3.length;
		int k3 = 3;
		rightRotate(arr3, n3, k3);
	}
	
	
	
	// Brute Force
	static void leftRotate(int arr[], int n, int k) {
		
		k = k % n;
		int temp[] = new int[k];
		
		
		for(int i=0; i<k; i++)			// storing k elem in temp[]
			temp[i] = arr[i];
		
		
		for(int i=k; i<n; i++)			// shifting array position
			arr[i-k] = arr[i];
		
		
		for(int i=n-k; i<n; i++)		// Placing temp elem to arr[]
			arr[i] = temp[i-(n-k)];
		
		
		printArray(arr, n);
	}
	
	
	
	
	// Optimal
	static void leftRotate2(int arr[], int n, int k) {
		
		k = k % n;
		
		// reverse 1st 'k' elements
		reverse(arr, 0, k-1);
		
		
		// reverse remaining elements
		reverse(arr, k, n-1);
		
		
		// reverse entire array
		reverse(arr, 0, n-1);
		
		
		printArray(arr, n);
		
	}
	
	
	
	// Right Rotate Optimal
	static void rightRotate(int arr[], int n, int k) {
		
		k = k % n;
		
		// Reverse entire array
		reverse(arr, 0, n-1);
		
		// Reverse 1st 'k' elements
		reverse(arr, 0, k-1);
		
		// Reverse remaining elements
		reverse(arr, k, n-1);
		
		
		printArray(arr, n);
	}
	
	
	
	
	// Reverse Array
	static void reverse(int arr[], int start, int end) {
		
		while(start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
	
	
	
	// Array printing
	static void printArray(int arr[], int n) {
		
		for(int i=0; i<n; i++)
			System.out.print(arr[i] + " ");
		
		System.out.println();
	}

}
