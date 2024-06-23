// Check whether a number is positive or negative

package numbers;

public class P08 {
	public static void main(String[] args) {
		
		int num = 5;
		
		System.out.println(check(num));
		
		check2(num);
	}
	
	
	
	// Comparing with zero
	static String check(int num) {
		
		if(num > 0)
			return "positive number";
		else
			return "negative number";
	}
	
	
	
	// Using Bitwise operators
	static void check2(int num) {
		
		if(num >> 31 == 0)
			System.out.println(num + " is a Positive number");
		else if(num >> 31 == -1)
			System.out.println(num + " is a Negative number");
	}
}
