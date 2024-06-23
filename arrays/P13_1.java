// Adding Element in an Array

package arrays;

public class P13_1 {

	public static void main(String[] args) {
		
		int arr1[] = {1,2,3,4,5,0};			// Extra for insertion
		int n1 = 5;
		int value1 = 6;
		insertBeginning(arr1, n1, value1);
		
		System.out.println();
		
		int arr2[] = {1,2,3,4,5,0};			// Extra for insertion
		int n2 = 5;
		int value2 = 6;
		insertLast(arr2, n2, value2);
		
		System.out.println();
		
		int arr3[] = {1,2,3,4,5,0};			// Extra for insertion
		int n3 = 5;
		int value3 = 6;
		int pos = 2;
		insertAtPosition(arr3, n3, value3, pos);
	}
	
	
	
	
	// Insert at Beginning
	static void insertBeginning(int arr[], int n, int value) {
		
		for(int i=n-1; i>=0; i--)
			arr[i+1] = arr[i];
		
		arr[0] = value;
		
		printArray(arr, n);
	}
	
	
	
	
	// Insert at Last
	static void insertLast(int arr[], int n, int value) {
		
		arr[n] = value;
		
		printArray(arr, n);
	}
	
	
	
	
	// Insert at any Position
	static void insertAtPosition(int arr[], int n, int value, int pos) {
		
		for(int i=n-1; i>=pos; i--) {
			arr[i+1] = arr[i];
		}
		
		arr[pos] = value;
		
		printArray(arr, n);
	}
	
	
	
	
	// Printing array
	static void printArray(int arr[], int n) {
		for(int val : arr)
			System.out.print(val + " ");
	}

}
