// Program to find Sum of GP Series

package numbers;

public class P11 {
	public static void main(String[] args) {
		
		int n = 4;
		int a = 2;
		int r = 2;
		
		System.out.println(sumOfGP(a, r, n));
		System.out.println(sumOfGP2(a, r, n));
	}
	
	
	
	// Using Loop
	static float sumOfGP(int a, int r, int n) {
		
		float sum = 0;
		
		for(int i=1; i<=n; i++) {
			//System.out.println(a);
			sum = sum + a;
			a = a * r;
		}
		
		return sum;
	}
	
	
	
	// USing Formula
	static float sumOfGP2(int a, int r, int n) {
		
		float sum = (float) (a * (Math.pow(r, n) - 1) / (r - 1));
		
		return sum;
	}

}
