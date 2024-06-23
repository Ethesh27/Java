// Rearrange array in increasing-decreasing order

package arrays;

import java.util.Arrays;

public class P06 {
	public static void main(String[] args) {
		
		int arr[] = {1,3,2,5,9,7};
		int n = arr.length;
		
		Arrays.sort(arr);
		
		// 1st half Increasing order
		for(int i=0; i<n/2; i++)
			System.out.print(arr[i] + " ");
		
		// 2nd half Decreasing order
		for(int i=n-1; i>=n/2; i--)
			System.out.print(arr[i] + " ");
	}

}
