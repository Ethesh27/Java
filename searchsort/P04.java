// Merge Sort:			T.C - O(nlogn)   &&   S.C - O(n) 

package searchsort;

public class P04 {
	public static void main(String[] args) {
		
		int arr[] = {48, 36, 13, 52, 19, 94, 21};
		int n = arr.length;
		mergeSort(arr, 0, n-1);
		
		// printing
		for(int val : arr)
			System.out.print(val + " ");
	}
	
	
	
	// Divide
	static void mergeSort(int arr[], int low, int high) {
		
		if(low < high) {
			
			int mid = (low + high) / 2;			// low + (high - low) / 2 -> For large elements
			mergeSort(arr, low, mid);			// Left half
			mergeSort(arr, mid+1, high);		// Right half
			
			merge(arr, low, mid, high);			// Merging
		}
	}
	
	
	
	// Merge 
	static void merge(int arr[], int low, int mid, int high) {
		
		int temp[] = new int[high - low + 1];	// temporary array
		int left = low;							// starting index of left half of array
		int right = mid+1;						// starting index of right half of array
		int k = 0;								// index for temp array
		
		
		
		// Storing elements in the temporary array in a sorted manner
		
		while(left <= mid && right <= high) {
			if(arr[left] <= arr[right]) {
				temp[k++] = arr[left++];
			}
			else {
				temp[k++] = arr[right++];
			}
		}
		
		
		// If elements on the left half are still left
		while(left <= mid) {
			temp[k++] = arr[left++];
		}
		
		
		// If elements on the left half are still left
		while(right <= high) {
			temp[k++] = arr[right++];
		}
		
		
		
		// Transferring all elements from temporary to arr
		for(int i=low; i<=high; i++)
			arr[i] = temp[i - low];		
		
	}

}
