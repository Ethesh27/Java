// Print Fibonacci Series up to Nth term

package numbers;

public class P17 {
	public static void main(String[] args) {
		
		int n = 5;
		
		fib(n);
		
		System.out.println();
		
		for(int i=0; i<=n; i++)
			System.out.print(fib2(i) + " ");
	}
	
	
	
	// Using Loop
	static void fib(int n) {
		
		if(n == 0) {
			System.out.println(0);
		}
		else {
			int secondLast = 0;
			int last = 1;
			int cur;
			
			System.out.print(secondLast + " " + last + " ");
			
			for(int i=2; i<=n; i++) {
				cur = last + secondLast;
				secondLast = last;
				last = cur;
				
				System.out.print(cur + " ");
			}
		}
			
	}
	
	
	
	// Using Recursion
	static int fib2(int n) {
		
		if(n == 0 || n==1)
			return n;
		
		return fib2(n-1) + fib2(n-2);
	}
}
