// Maximum 'Product' Sub-array in an Array

package arrays;

public class P17_1 {

	public static void main(String[] args) {
		
		int arr[] = {2, 2, -3, 0, -4, -5};
		int n = arr.length;
		
		System.out.println(maxProductSubArray(arr, n));
		System.out.println(maxProductSubArray2(arr, n));
		System.out.println(maxProductSubArray3(arr, n));

	}
	
	
	
	// Brute-Force
	static int  maxProductSubArray(int arr[], int n) {
		
		int max = Integer.MIN_VALUE;
		
		for(int i=0; i<n; i++) {
			for(int j=i; j<n; j++) {
				
				int prod = 1;
				for(int k=i; k<=j; k++)
					prod = prod * arr[k];
				
				max = Math.max(max, prod);
				
				//print
				if(max == 20)
					for(int k=i; k<=j; k++)
						System.out.print(arr[k] + " ");
			}
		}
		
		return max;
	}
	
	
	
	// Better 
	static int  maxProductSubArray2(int arr[], int n) {
		
		int max = Integer.MIN_VALUE;
		
		for(int i=0; i<n; i++) {
			
			int prod = 1;
			
			for(int j=i; j<n; j++) {
				prod = prod * arr[j];
				max = Math.max(max, prod);
			}
			
			//max = Math.max(max, prod);

		}
		
		return max;
	}
	
	
	
	
	// Optimal-1
	static int  maxProductSubArray3(int arr[], int n) {
		
		int prefix=1, suffix=1;
		int max = Integer.MIN_VALUE;
		
		for(int i=0; i<n; i++) {
			
			if(prefix == 0) prefix = 1;
			if(suffix == 0) suffix = 1;
			
			prefix = prefix * arr[i];
			suffix = suffix * arr[n-i-1];
			
			max = Math.max(max, Math.max(prefix, suffix));
		}
		
		return max;
	}
	
	

}
