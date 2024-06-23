// Find all Palindrome Numbers in a given range

package numbers;

public class P02_01 {
	public static void main(String[] args) {
		
		int min = 10;
		int max = 50;
		
		for(int i=min; i<=max; i++) {
			if(isPalindrome(i))
				System.out.println(i);
		}
	}
	
	
	
	static boolean isPalindrome(int num) {
		
		int rev = 0;
		int original_no = num;
		
		while(num > 0) {
			int last_digit = num % 10;
			rev = rev * 10 + last_digit;
			num = num / 10;
		}
		
		
		if(original_no == rev)
			return true;
		else 
			return false;
		
	}

}
