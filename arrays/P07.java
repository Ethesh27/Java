// Calculate Sum of the Elements of the Array

package arrays;

public class P07 {
	public static void main(String[] args) {
		
		int arr[] = {1,2,3};
		int sum = 0;
		
		for(int i=0; i<arr.length; i++)
			sum = sum + arr[i];
		
		System.out.println("Sum = " + sum);
		
	}

}
