// Find the smallest element in an array

package arrays;

import java.util.Arrays;

public class P01 {
	public static void main(String[] args) {
		
		int arr[] = {3, 2, 5, 1, 9};
		System.out.println("Smallest element in array:" + findSmallElem(arr));
		System.out.println("Smallest element in array:" + findSmallElem2(arr));
	}
	
	
	// Sol-1: Sorting
	static int findSmallElem(int arr[]) {
		Arrays.sort(arr);
		return arr[0];
	}
	
	
	// Sol-2: Using a min variable
	static int findSmallElem2(int arr[]) {
		int min  = arr[0];
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		
		return min;
	}
	
}
