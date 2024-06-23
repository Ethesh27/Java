// Average of all the elements in the array   or  Find 'Mean'

package arrays;

public class P09 {
public static void main(String[] args) {
		
		int arr[] = {1,7,9};
		int n = arr.length;
		int sum = 0;
		
		for(int i=0; i<n; i++)
			sum +=(double)arr[i];
		
		double avg = sum / n;
		
		System.out.println("Sum = " + sum);
		System.out.println("Avg = " + avg);
		
	}

}


// Mean of an array = (sum of all elements) / (number of elements)