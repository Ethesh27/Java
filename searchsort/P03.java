// Insertion Sort:		T.C - O(n^2)   &&   S.C - O(1)

package searchsort;

public class P03 {
	public static void main(String[] args) {
		
		int arr[] = {5, 1, 6, 2, 4, 3};
		int n = arr.length;
		insertionSort(arr, n);
		
		System.out.println();
		
		String arr2[] = {"deepak", "amith", "deepash", "rahul", "varun"};
		int n2 = arr2.length;
		insertionSort2(arr2, n2);
	}
	
	
	// Number
	static void insertionSort(int arr[], int n) {
		
		for(int i=1; i<n; i++) {
			int temp = arr[i];
			int j = i;
			
			while(j>0 && arr[j-1]>temp) {
				arr[j] = arr[j-1];
				j--;
			}
			
			arr[j] = temp;
		}
		
		
		//Print
		for(int val : arr)
			System.out.print(val + " ");
	}
	
	
	
	// String
	static void insertionSort2(String arr[], int n) {
			
		for(int i=1; i<n; i++) {
			String temp = arr[i];
			int j = i;
				
			while(j>0 && arr[j-1].compareTo(temp)>0) {
				arr[j] = arr[j-1];
				j--;
			}
			
			arr[j] = temp;
		}
			
			
		//Print
		for(String val : arr)
			System.out.print(val + " ");
	}
	
}
