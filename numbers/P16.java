// Maximum and Minimum Digit in a Number

package numbers;

public class P16 {

	public static void main(String[] args) {
		
		int num = 359;
		
		maxMin(num);
	}
	
	
	
	static void  maxMin(int num) {
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		while(num > 0) {
			int rem = num % 10;
			max = Math.max(max, rem);
			min = Math.min(min, rem);
			num = num / 10;
		}
		
		System.out.println("Max = " + max + " and Min = " + min);
	}

}
