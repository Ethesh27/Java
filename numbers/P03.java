// Check if a number is prime or not

package numbers;

public class P03 {
	public static void main(String[] args) {
		
		int num = 11;
		
		if(isPrime2(num)) {
			System.out.println("Prime number");
		}
		else {
			System.out.println("Not a Prime number");
		}
		
		
	}
	
	
	
	// Using Iterative solution									T.C : O(n)
	static boolean isPrime(int num) {
		
		if(num == 1)
			return false;
		
		for(int i=2; i<num; i++) {
			if(num % i == 0)
				return false;
		}
		
		return true;
	}
	
	
	
	// Optimized Approach										T.C : O(sqrt(n))
	static boolean isPrime2(int num) {
		
		if(num == 1)
			return false;
		
		for(int i=2; i<Math.sqrt(num); i++) {
			if(num % i == 0)
				return false;
		}
		
		return true;
	}
	
}
