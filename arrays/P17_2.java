// Maximum 'Sum' Sub-array in an Array

package arrays;

public class P17_2 {
	public static void main(String[] args) {
		
		int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};
		//int arr[] = {-1, -2, -3};
		int n = arr.length;
		
		System.out.println(maxSumSubArray(arr, n));
		System.out.println(maxSumSubArray2(arr, n));
		System.out.println(maxSumSubArray3(arr, n));
		System.out.println(maxSumSubArray4(arr, n));

	}
	
	
	
	// Brute-Force
	static int maxSumSubArray(int arr[], int n) {
		
		int max = Integer.MIN_VALUE;
		
		for(int i=0; i<n; i++) {
			for(int j=i; j<n; j++) {
				
				int sum = 0;
				
				for(int k=i; k<=j; k++)
					sum = sum + arr[k];
				
				max = Math.max(max, sum);
			}
		}
		
		return max;
	}
	
	
	
	
	//Better-Approach
	static int maxSumSubArray2(int arr[], int n) {
		
		int max = Integer.MIN_VALUE;
		
		for(int i=0; i<n; i++) {
			
			int sum = 0;
			
			for(int j=i; j<n; j++) {
				sum = sum + arr[j];
				max = Math.max(max, sum);
			}
		}
		
		return max;		
	}
	
	
	
	
	// Optimal - Kadane's Algorithm 
	static int maxSumSubArray3(int arr[], int n) {
		
		int max = Integer.MIN_VALUE;
		int sum = 0;
		
		for(int i=0; i<n; i++) {
			
			sum = sum + arr[i];
			
			if(sum > max)
				max = sum;
			
			if(sum < 0)
				sum = 0;
			
		}
		
		return max;
	}
	
	
	
	
	// To print Sub-Array along with maximum sum
	static int maxSumSubArray4(int arr[], int n) {
		
		int max = Integer.MIN_VALUE;
		int sum = 0;
		
		int start = 0;
		int ansStart = -1, ansEnd = -1;
		
		for(int i=0; i<n; i++) {
			
			if(sum == 0)
				start = i;
				
			sum = sum + arr[i];
			
			if(sum > max) {
				max = sum;
				
				ansStart = start;
				ansEnd = i;
			}
			
			if(sum < 0)
				sum = 0;
		}
		
		
		// Printing sub-array
		System.out.print("The sub-array is : [");
		
		for(int i=ansStart; i<=ansEnd; i++)
			System.out.print(arr[i] + " ");
		
		System.out.println("]");
		
		
		
		return max;
	}
	
}
