// Find Sum of AP Series

package numbers;

public class P10 {
	public static void main(String[] args) {
		
		int n = 4;
		float a = 2;
		float d = 2;
		
		System.out.println(sumOfAP(a, d, n));
		System.out.println(sumOfAP2(a, d, n));
	}
	
	
	
	// Using loop
	static float sumOfAP(float a, float d, int n) {
		
		float sum = 0;
		
		for(int i=1; i<=n; i++) {
			//System.out.println(a);			//this will give AP Series
			sum = sum + a;
			a = a + d;
		}
		
		return sum;
	}
	
	
	
	// Using Formula
	static float sumOfAP2(float a, float d, int n) {
		
		float sum = 0;
		
		sum = (n/2) * ((2*a) + (n-1) * d);
		
		return sum;
	}
}
