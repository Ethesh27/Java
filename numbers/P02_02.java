// Count number of digits

package numbers;

public class P02_02 {
	public static void main(String[] args) {
		
		int num = 12345;
		
		System.out.println(countDigit(num));
		System.out.println(countDigit2(num));
		System.out.println(countDigit3(num));
	}
	
	
	
	// Brute-Force:  									T.C: O(n)
	static int countDigit(int num) {
		
		int count = 0;
		
		while(num>0) {
			num = num / 10;
			count++;
		}
		
		return count;
	}
	
	
	
	// Using 'toString'									T.C: O(1)
	static int countDigit2(int num) {
		
		String num2 = Integer.toString(num);
		return num2.length();
	}
	
	
	
	// Using 'logarithm base 10'						T.C: O(1)
	static int countDigit3(int num) {
		
		int digit = (int) Math.floor(Math.log10(num) + 1);
		
		return digit;
	}
	
	
}
