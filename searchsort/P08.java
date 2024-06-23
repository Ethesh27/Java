package searchsort;

public class P08 {

	public static void main(String[] args) {
		
		int arr[] = {1, 2, 4, 5, 7, 8, 9};		// For B.S array should be sorted
		int n = arr.length;
		int key = 88;
		
		int result = binarySearch2(arr, 0, n-1, key);
		
		if(result == -1)
			System.out.println("Element not found");
		else
			System.out.println("Element found at index " + result);
	}
	
	
	// Recursive Method
		static int binarySearch2(int arr[], int low, int high, int key) {
			
			if(low <= high) {
				
				int mid = (low + high) / 2;
				
				if(arr[mid] == key)
					return mid;
				
				if(arr[mid] > key)
					return binarySearch2(arr, low, mid-1, key);
				
				return binarySearch2(arr, mid+1, high, key);
			}
			
			return -1;
		}

}
