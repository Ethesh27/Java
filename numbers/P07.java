// Check whether a given number is even or odd

package numbers;

public class P07 {
	public static void main(String[] args) {
		
		int num = 5;
		
		System.out.println(check(num));
		System.out.println(check2(num));
		
	}
	
	 
	// Using Division Method
	static String check(int num) {
		
		if(num % 2 == 0) return "Even";
		
		return "Odd";
	}
	
	
	
	// Using the bitwise operator
	static String check2(int num) {
		
		if((num & 1) == 0) 
			return "Even";
		else
			return "Odd";
	}
}


/*

Even Number: The last bit of even number is always 0.

Odd Number: Last bit of the odd number is always 1.

*/