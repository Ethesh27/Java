// Greatest of two numbers

package numbers;

public class P12 {
	public static void main(String[] args) {
		
		int n1 = 3;
		int n2 = 5;
		
		
		// Using if-else
		if(n1 > n2)
			System.out.println(n1 + " is Largest");
		else
			System.out.println(n2 + " is Largest");
		
		
		// In-build Library
		System.out.println("Largest number is " + Math.max(n1, n2));
			
	}

}
