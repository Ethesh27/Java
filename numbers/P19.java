// Calculate the Power of a Number : Binary Exponentiation

package numbers;

public class P19 {
	public static void main(String[] args) {
		
		int n = 2;
		int k = 3;
		
		
		// using loop
		int ans = 1;
		
		for(int i=0; i<k; i++)
			ans = ans * n;
		
		System.out.println(ans);
		
		
		
		// Build in function
		int ans2 = (int) Math.pow(n, k);
		
		System.out.println(ans2);
	}

}
