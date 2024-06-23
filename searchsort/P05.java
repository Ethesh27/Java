// Quick Sort:			T.C: O(n^2); O(nlogn)     &&    S.C: O(1)

package searchsort;

public class P05 {
	public static void main(String[] args) {
		
		//int arr[] = {15, 9, 7, 13, 12, 16, 4, 18, 11};
		
		int arr[] = {5, 4, 1, 6, 7};
		int n = arr.length;
		quickSort(arr, 0, n-1);
		
		// Print
		for(int val : arr)
			System.out.print(val + " ");
	}
	
	
	
	static int partition(int arr[], int low, int high) {
		
		int pivot = arr[(low + high) / 2];
		
		int i = low;
		int j = high;
		
		while(i <= j) {
			
			while(arr[i] < pivot)
				i++;
			
			while(arr[j] > pivot)
				j--;
			
			if(i <= j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				
				i++;
				j--;
			}
		}
		
		return i;
	}
	
	
	
	static void quickSort(int arr[], int low, int high) {
		
		if(low < high) {
			
			int pi = partition(arr, low, high);
			
			//if(low < pi-1)
				quickSort(arr, low, pi-1);
			
			//if(pi < high)
				quickSort(arr, pi, high);
		}
	}

}
