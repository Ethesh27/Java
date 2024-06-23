// Check if given year is a leap year or not

package numbers;

public class P14 {
	public static void main(String[] args) {
		
		int year = 2024;
		
		if((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0))
			System.out.println(year + " is Leap year");
		else
			System.out.println(year + " is not a Leap year");
		
	}

}



/*

A year is a leap year only if it satisfies the following condition.

# The year is divisible by 400
# The year is divisible by 4 but not by 100

*/
