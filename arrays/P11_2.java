// Remove Duplicates in-place from Sorted Array

package arrays;

import java.util.HashSet;

public class P11_2 {
	public static void main(String[] args) {
		
		int arr[] = {1,1,2,2,3,3,3};
		int n = arr.length;
		int k = removeDuplicate(arr, n);
		
		for(int i=0; i<k; i++)
			System.out.print(arr[i] + " ");
		
		
		System.out.println();
		
		int arr2[] = {5,5,6,6,7,8};
		int n2 = arr2.length;
		int k2 = removeDuplicate2(arr2, n2);
		
		for(int i=0; i<k2; i++)
			System.out.print(arr2[i] + " ");
	}
	
	
	
	// Brute Force - HashSet
	static int removeDuplicate(int arr[], int n) {
		
		HashSet<Integer> set = new HashSet<>();
		
		for(int i=0; i<n; i++)			// add unique elements into set
			set.add(arr[i]);
		
		
		int j = 0;						// Placing unique elements at 1st of array
		for(int val : set)
			arr[j++] = val;
		
		
		int k = set.size();
		
		return k;		
	
	}
	
	
	
	// Optimal - Two Pointers
	static int removeDuplicate2(int arr[], int n) {
		
		int i = 0;
		
		for(int j=1; j<n; j++) {
			if(arr[i] != arr[j]) {
				arr[i+1] = arr[j];
				i++;
			}
		}
		
		return i+1;
	}

}
