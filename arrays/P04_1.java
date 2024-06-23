// Check if array is sorted or not

package arrays;

public class P04_1 {
	public static void main(String[] args) {
		
		int arr1[] = {1,2,3};
		int arr2[] = {3,1,2};
		
		System.out.println(isSorted(arr1));
		System.out.println(isSorted(arr2));
	}
	
	
	static boolean isSorted(int arr[]) {
		
		int n = arr.length;
		
		for(int i=1; i<n; i++) {
			if(arr[i] > arr[i-1]) {
				
			}
			else {
				return false;
			}
		}
		
		return true;
		
	}

}
