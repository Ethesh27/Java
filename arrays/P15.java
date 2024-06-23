// Find all the non-repeating elements in an array

package arrays;

import java.util.HashMap;
import java.util.Map;

public class P15 {
	public static void main(String[] args) {
		
		int arr1[] = {1,2,1,3,1,5,3};
		int n1 = arr1.length;
		findNonRepeating(arr1, n1);
		
		System.out.println();
		
		int arr2[] = {1,2,1,3,1,5,3};
		int n2 = arr2.length;
		findNonRepeating2(arr2, n2);
	}
	
	
	
	// Brute-Force
	static void findNonRepeating(int arr[], int n) {
		
		for(int i=0; i<n; i++) {
			boolean chk = false;
			
			for(int j=0; j<n; j++) {
				if(i != j && arr[i] == arr[j]) {
					chk = true;
					break;
				}		
			}
			
			if(chk == false)
				System.out.println(arr[i]);
		}
	}
	
	
	
	// HashMap
	static void findNonRepeating2(int arr[], int n) {
		
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int i : arr) {
			
			if(map.containsKey(i)) 
				map.put(i, map.get(i) + 1);
			
			else 
				map.put(i, 1);	
		}
		
		
		for(Map.Entry<Integer, Integer> e : map.entrySet()) {
			
			if(e.getValue() == 1)
				System.out.println(e.getKey());
			
		}
		
	}
}
