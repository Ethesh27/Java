// Check if a number is Armstrong Number or not

package numbers;

public class P05 {
	public static void main(String[] args) {
		
		int num = 153;
		
		if(isArmstrong(num))
			System.out.println(num + " is an Armstrong Number");
		else
			System.out.println(num + " is not an Armstrong Number");
	}
	
	
	
	static boolean isArmstrong(int num) {
		
		int original_no = num;
		int temp = num;
		int count = 0;				// to know no. of digits
		
		while(temp > 0) {
			count++;
			temp = temp / 10;
		}
		
		int sumofpower = 0;
		
		while(num > 0) {
			int digit = num % 10;
			sumofpower += Math.pow(digit, count);
			num = num / 10;
		}
		
		return (original_no == sumofpower);
		
	}

}
