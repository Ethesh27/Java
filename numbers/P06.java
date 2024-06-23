// Check whether a number is Perfect Number or not

package numbers;

public class P06 {
	public static void main(String[] args) {
		
		int num = 6;
		
		if(isPerfect(num)) {
			System.out.println(num + " is a Perfect number");
		}
		else {
			System.out.println(num + " is not a Perfect number");
		}
		
	}
	
	
	
	static boolean isPerfect(int num) {
		
		int sum = 0;
		
		for(int i=1; i<num; i++)
			if(num % i == 0)
				sum = sum + i;
		
		if(sum == num) return true;
		
		return false;
	}

}



// A perfect number is defined as a number that is the sum of its proper divisors 
// (all its positive divisors excluding itself). 