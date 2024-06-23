// Factors of a Given Number

package numbers;

public class P20 {
	public static void main(String[] args) {
		
		int num = 14;
		
		findFactor(num);
		
		System.out.println();
		
		findFactor2(num);
	}
	
	
	// Brute force
	static void findFactor(int num) {
		
		for(int i=1; i<=num; i++) {
			if(num % i == 0)
				System.out.print(i + " ");
		}
	}
	
	
	
	// Optimised approach
	static void findFactor2(int num) {
		
		for(int i=1; i<=Math.sqrt(num); i++) {
			if(num % i == 0) {
				
				if(num/i == i)
					System.out.print(i + " ");
				else
					System.out.print(i + " " + num/i + " ");
			}
		}
	}
}
