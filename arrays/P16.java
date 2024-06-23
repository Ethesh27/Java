// Find all Symmetric Pairs in the array of pairs

package arrays;

import java.util.HashMap;

public class P16 {
	public static void main(String[] args) {
		
		int arr[][] = {{1,2}, {2,1}, {3,4}, {4,5}, {5,4}};
		int n = arr.length;
		
		findSymmetric(arr, n);
		
		System.out.println();
		
		findSymmetric2(arr, n);
	}
	
	
	
	// Brute-Force
	static void findSymmetric(int arr[][], int n) {
		
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				if(arr[i][0] == arr[j][1] && arr[i][1] == arr[j][0]) {
					System.out.print( "(" + arr[i][0] + " " + arr[i][1] + ") ");
					break;
				}	
			}
		}
	}
	
	
	
	// HashMap
	static void findSymmetric2(int arr[][], int n) {
		
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int i=0; i<n; i++) {
			
			int first = arr[i][0];
			int second = arr[i][1];
			
			if(map.get(second) != null  &&  map.get(second) == first)
				System.out.print( "(" + first + " " + second + ") ");
			
			else
				map.put(first, second);
		}
	}
}
