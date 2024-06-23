// Find all repeating elements in an array

package arrays;

import java.util.HashMap;
import java.util.Map;

public class P14 {
	public static void main(String[] args) {
		
		int arr1[] = {1,1,1,2,3,1,2,5,5};
		int n1 = arr1.length;
		findRepeatingElem(arr1, n1);
		
		System.out.println();
		
		int arr2[] = {1,1,1,2,3,1,2,5,5};
		int n2 = arr2.length;
		findRepeatingElem2(arr2, n2);
	}
	
	
	
	// Brute Force
	static void findRepeatingElem(int arr[], int n) {
		
		int cnt = 0;
		int dup[] = new int[n];
		
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				if(arr[i] == arr[j])
					dup[cnt++] = arr[i];
			}
		}
		
		
		for(int i=0; i<cnt; i++)
			if(dup[i] != dup[i+1])
				System.out.print(dup[i] + " ");
	}
	
	
	
	
	// HashMaps
	static void findRepeatingElem2(int arr[], int n) {
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i=0; i<n; i++) {
			if(map.get(arr[i]) == null) {
				map.put(arr[i], 1);	
			}
			else {
				map.put(arr[i], map.get(arr[i]) + 1);
			}	
		}
		
		
		for(Map.Entry<Integer, Integer> e : map.entrySet())
			if(e.getValue() > 1)
				System.out.print(e.getKey() + " ");
	
	}
	
	

}
