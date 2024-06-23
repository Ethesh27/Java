// Selection Sort:    T.C - O(n^2)   &&   S.C - O(1)

package searchsort;

public class P02 {
	public static void main(String[] args) {
		
		int arr[] = {38, 52, 9, 18, 6, 62, 13};
		int n = arr.length;
		selectionSort(arr, n);
		
		System.out.println();
		
		String arr2[] = {"deepak", "amith", "deepash", "rahul", "varun"};
		int n2 = arr2.length;
		selectionSort2(arr2, n2);
	}
	
	
	// Numbers
	static void selectionSort(int arr[], int n) {
		
		for(int i=0; i<n; i++) {
			int min = i;
			
			for(int j=i+1; j<n; j++) {
				if(arr[j] < arr[min])
					min = j;
			}
			
			//swap
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
		
		
		//print
		for(int val : arr)
			System.out.print(val + " ");
	}
	
	
	
	// String
	static void selectionSort2(String arr[], int n) {
		
		for(int i=0; i<n; i++) {
			int min = i;
			
			for(int j=i+1; j<n; j++) {
				
				if(arr[j].compareTo(arr[min]) < 0)
					min = j;
			}
			
			//swap
			String temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
		
		
		//Print
		for(String val : arr)
			System.out.print(val + " ");
	}

}
