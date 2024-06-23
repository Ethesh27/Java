// Find Median of the given Array
// Note: To find Median Arrays should be sorted

package arrays;

import java.util.Arrays;

public class P10 {
	public static void main(String[] args) {
		
		int arr1[] = {2,4,1,3,5};		// odd 'n'
		int arr2[] = {2,5,1,7};			// even 'n'
		
		getMedian(arr1);
		getMedian(arr2);
	}
	
	
	static void getMedian(int arr[]) {
		
		int n = arr.length;
		Arrays.sort(arr);
		
		// For even n
		if(n%2 == 0) {
			
			int indx1 = arr[(n/2)-1];
			int indx2 = arr[n/2];
			
			double median = (double)(indx1 + indx2) / 2;
			
			System.out.println(median);
		}
		// For odd n
		else {
			
			double median = arr[n/2];
			System.out.println(median);
			
		}
	}

}
