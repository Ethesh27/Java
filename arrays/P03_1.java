// Find Second Smallest Element in an array

package arrays;

import java.util.Arrays;

public class P03_1 {
	public static void main(String[] args) {
		int arr[] = {3, 2, 5, 1, 9, 1};
		int n = arr.length;
		
		System.out.println("Second smallest element:" + getElem(arr, n));
		System.out.println("Second smallest element:" + getElem2(arr, n));
		System.out.println("Second smallest element:" + getElem3(arr, n));
	}
	
	
	// Sol-1: Brute force
	static int getElem(int arr[], int n) {
		
		Arrays.sort(arr);
		int small = arr[0];
		int ssmall = Integer.MAX_VALUE;
		
		for(int i=0; i<n; i++) {
			if(arr[i] != small) {
				ssmall = arr[i];
				break;
			}
		}
		
		return ssmall;	
	}
	
	
	// Sol-2: Better 
	static int getElem2(int arr[], int n) {
		
		int small = Integer.MAX_VALUE;
		for(int i=0; i<n; i++) {
			small = Math.min(small, arr[i]);
		}
		
		int ssmall = Integer.MAX_VALUE;
		for(int i=0; i<n; i++) {
			if(arr[i] != small && arr[i] < ssmall) {
				ssmall = arr[i];
			}
		}
		
		return ssmall;
	}
	
	
	// Sol-3: Optimal
	static int getElem3(int arr[], int n) {
		
		int small = Integer.MAX_VALUE;
		int ssmall = Integer.MAX_VALUE;
		
		for(int i=0; i<n; i++) {
			if(arr[i] < small) {
			//	small = arr[i];     	Don't put small 1st, will get wrong o/p
				ssmall = small;
				small = arr[i];
			}
			else if(arr[i] != small && arr[i]< ssmall) {
				ssmall = arr[i];
			}
		}
		
		return ssmall;
	}
	
	
	

}
