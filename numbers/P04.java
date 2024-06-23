// Prime Numbers in a given range

package numbers;

public class P04 {

	public static void main(String[] args) {
		
		int min = 1;
		int max = 20;
				
		for(int i=min; i<=max; i++) {
			if(isPrime(i))
				System.out.println(i);
		}
	}
	
	
	
	static boolean isPrime(int num) {
		
		if(num == 1)
			return false;
		
		for(int i=2; i<Math.sqrt(num); i++) {
			if(num % i == 0)
				return false;
		}
		
		return true;
	}

}
