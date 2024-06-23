// Reverse digits of a number

package numbers;

public class P15 {
	public static void main(String[] args) {
		
		int num = 123;
		
		System.out.println(reverse(num));
	}
	
	
	
	static int reverse(int num) {						// T.C: O(logn)
		
		int rev = 0;
		
		while(num > 0) {
			int rem = num % 10;
			rev = rev*10 + rem;
			num = num / 10;
		}
		
		return rev;
	}

}
