// Sum of first N Natural Numbers

package numbers;

public class P09 {
	public static void main(String[] args) {
		
		int n = 5;
		
		System.out.println(fun(n));
		System.out.println(fun2(n));
		System.out.println(fun2(n));
		
	}
	
	
	
	// Using Loop											T.C: O(n)
	static int fun(int n) {
		
		int sum = 0;
		
		for(int i=1; i<=n; i++)
			sum = sum + i;
		
		return sum;
	}
	
	
	
	// Using Formula										T.C: O(1)
	static int fun2(int n) {
		
		int sum = n * (n + 1) / 2;
		
		return sum;
	}
	
	
	
	// Recursive 											T.C: O(n)
	static int fun3(int n) {
		
		if(n == 0)
			return 0;
		
		return n + fun3(n - 1);
	}

}
