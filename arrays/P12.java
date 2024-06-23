// Remove Duplicates From an Unsorted Array

package arrays;

import java.util.HashMap;

public class P12 {
	public static void main(String[] args) {
		
		int arr[] = {5,9,1,1,2,2,3,3,9};
		int n = arr.length;
		removeDuplicate(arr, n);
		
		System.out.println();
		
		int arr2[] = {5,9,1,1,2,2,3,3,9};
		int n2 = arr2.length;
		removeDuplicate2(arr2, n2);
	}
	
	
	
	// Brute Force
	static void removeDuplicate(int arr[], int n) {
		
		boolean visited[] = new boolean[n];
		
		for(int i=0; i<n; i++) {
			
			if(visited[i] == true)
				continue;
			
			
			for(int j=i+1; j<n; j++) {
				if(arr[i] == arr[j]) {
					visited[j] = true;
				}
			}
		}
		
		
		for(int i=0; i<n; i++) {
			if(visited[i] != true)
				System.out.print(arr[i] + " ");
		}
	}
	
	
	
	// Optimal - HashMap
	static void removeDuplicate2(int arr[], int n) {
		
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int i=0; i<n;i++) {
			if(!map.containsKey(arr[i])) {
				System.out.print(arr[i] + " ");
				map.put(arr[i], 1);
			}
		}
	}
	

}
