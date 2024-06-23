// Greatest of three numbers

package numbers;

public class P13 {
	public static void main(String[] args) {
		
		int n1 = 3;
		int n2 = 5;
		int n3 = 9;
		int large;
		
		
		// Using if else
		if(n1 > n2 && n1 > n3)
			large = n1;
		else if(n2 > n3)
			large = n2;
		else
			large = n3;
		
		
		System.out.println("Largest is " + large);
		
		
		
		// Using In-Build Library
		System.out.println("Larget number is " + Math.max(n1, Math.max(n2, n3)));
	}

}
