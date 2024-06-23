// Count frequency of each element in the array

package arrays;

import java.util.*;

public class P05_2 {
	public static void main(String[] args) {
		
		int arr[] ={10,5,10,15,10,5};
	      int n = arr.length;
	      
	      countFreq(arr, n);
	      
	      System.out.println();
	      
	      countFreq2(arr, n);
	}
	
	
	
	// Sol-1: Use of two loops
	static void countFreq(int arr[], int n) {
		
		boolean visited[] = new boolean[n];
		
		for(int i=0; i<n; i++) {
			
			if(visited[i] == true)
				continue;
			
			int count = 1;
			for(int j=i+1; j<n; j++) {
				if(arr[i] == arr[j]) {
					visited[j] = true;
					count++;
				}
			}
			
			System.out.println(arr[i] + " - " + count);
		}
				
	}
	
	
	
	// Sol-2: Hashmaps
	static void countFreq2(int arr[], int n) {
		
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int i=0; i<n; i++) {
			
			if(map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			} 
			else {
				map.put(arr[i], 1);
			}
		}
		
		
		for(Map.Entry<Integer, Integer> e : map.entrySet()) {
			System.out.println(e.getKey() + " - " + e.getValue());
		}
		
	}

}
