// Find the largest element in an array

package arrays;

import java.util.Arrays;

public class P02 {
	public static void main(String[] args) {
		
		int arr[] = {3, 2, 5, 1, 9};
		System.out.println("Largest element in array:" + findLargeElem(arr));
		System.out.println("Largest element in array:" + findLargeElem2(arr));
	}
	
	
	// Sol-1: Sorting
	static int findLargeElem(int arr[]) {
		Arrays.sort(arr);
		
		int n = arr.length;
		return arr[n-1];
	}
	
	
	// Sol-2: Using a min variable
	static int findLargeElem2(int arr[]) {
		int max  = arr[0];
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		
		return max;
	}
	
}
