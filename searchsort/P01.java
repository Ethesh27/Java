// Bubble Sort:   T.C - O(n^2)   &&   S.C - O(1)

package searchsort;

public class P01 {
	public static void main(String[] args) {
		
		int arr[] = {36, 19, 29, 12, 5};
		int n = arr.length;
		bubbleSort(arr, n);
		
		System.out.println();
		
		String arr2[] = {"deepak", "amith", "deepash", "rahul", "varun"};
		int n2 = arr2.length;
		bubbleSort2(arr2, n2);
		
	}
	
	
	
	// For numbers
	static void bubbleSort(int arr[], int n) {
		
		for(int i=0; i<n; i++) {
			int flag = 0;
			
			for(int j=0; j<n-1-i; j++) {
				
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					flag = 1;
				}
			}
			
			if(flag == 0) {
				break;
			}
		}
		
		
		for(int val : arr)
			System.out.print(val + " ");
	}
	
	
	
	// For String
	static void bubbleSort2(String arr[], int n) {
		
		for(int i=0; i<n; i++) {
			
			for(int j=0; j<n-1-i; j++) {
				
				if(arr[j].compareTo(arr[j+1]) > 0) {
					String temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		
		for(String val : arr)
			System.out.print(val + " ");
	}

}



/*
 Note:
 
if s1 > s2, it returns positive number  
if s1 < s2, it returns negative number  
if s1 == s2, it returns 0 


The Java String class compareTo() method compares the given string with the current string lexicographically. 
It returns a positive number, negative number, or 0.

 */
