// Find Second Largest Element in an array


package arrays;

import java.util.Arrays;

public class P03_2 {
	public static void main(String[] args) {
		int arr[] = {3, 2, 5, 1, 9, 1, 9};
		int n = arr.length;
		
		System.out.println("Second largest element:" + getElem(arr, n));
		System.out.println("Second largest element:" + getElem2(arr, n));
		System.out.println("Second largest element:" + getElem3(arr, n));
	}
	
	
	
	// Sol-1: Brute Force
	static int getElem(int arr[], int n) {
		
		Arrays.sort(arr);
		int large = arr[n-1];
		int slarge = Integer.MIN_VALUE;
		
		for(int i=n-2; i>=0; i--) {
			if(arr[i] != large) {
				slarge = arr[i];
				break;
			}
		}
		
		return slarge;
	}
	
	
	
	// Sol-2: Better
	static int getElem2(int arr[], int n) {
		
		int large = Integer.MIN_VALUE;
		for(int i=0; i<n; i++) {
			if(arr[i] > large) {
				large = arr[i];
			}
		}
		
		int slarge = Integer.MIN_VALUE;
		for(int i=0; i<n; i++) {
			if(arr[i] != large && arr[i] > slarge) {
				slarge = arr[i];
			}
		}
		
		return slarge;
	}
	
	
	
	// Sol-3: Optimal
	static int getElem3(int arr[], int n) {
		
		int large = Integer.MIN_VALUE;
		int slarge = Integer.MIN_VALUE;
		
		for(int i=0; i<n; i++) {
			if(arr[i] > large) {
				slarge = large;
				large = arr[i];
			}
			else if(arr[i] != large && arr[i] > slarge) {
				slarge = arr[i];
			}
		}
		
		return slarge;
	}
	
	
	
	

}
