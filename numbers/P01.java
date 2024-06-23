// Check if a number is Palindrome or Not

package numbers;

public class P01 {
	public static void main(String[] args) {
		
		int num = 121;
		
		if(isPalindrome(num))
			System.out.println(num + " is a Palindrome");
		else 
			System.out.println(num + " is Not a Palindrome");
	}
	
	
	static boolean isPalindrome(int num) {
			
			int rev = 0;
			int original_no = num;
			
			while(num > 0) {
				int rem = num % 10;
				rev = rev * 10 + rem;
				num = num / 10;
			}
			
			
			if(original_no == rev)
				return true;
			else 
				return false;
			
		}

}
