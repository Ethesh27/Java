// Factorial of a Number

package numbers;

public class P18 {
	public static void main(String[] args) {
		
		int n = 5;
		
		System.out.println(fact(n));
		System.out.println(fact2(n));
		System.out.println(fact3(n));
	}
	
	
	
	// Using Loop
	static int fact(int n) {
		
		int fact = 1;
		
		for(int i=1; i<=n; i++)
			fact = fact * i;
		
		return fact;
	}
	
	
	
	// Using Recursion
	static int fact2(int n) {
		
		if(n==0 || n==1)
			return 1;
		
		return n * fact2(n-1);
	}
	
	
	
	// Without using Multiplication
	static int fact3(int N) {
		
		if(N == 0) {
			return 1;
		}
		else {
			int ans = N;
			 
	        // Outer loop
	        for (int i = N - 1; i > 0; i--) {
	            int sum = 0;
	 
	            // Inner loop
	            for (int j = 0; j < i; j++)
	                sum = sum + ans;
	            ans = sum;
	        }
	        return ans;
		}
			    
	}
}
