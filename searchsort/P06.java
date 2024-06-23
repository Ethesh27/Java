// Linear Search:			T.C: O(n)		&&  	S.C: O(1)

package searchsort;

public class P06 {
	public static void main(String[] args) {
		
		int arr[] = {4, 5, 3, 1, 2, 5};
		int n = arr.length;
		int key = 5;
		linearSearch(arr, n, key);
		
		System.out.println();
		
		String arr2[] = {"deepak", "amith", "deepash", "rahul", "varun"};
		int n2 = arr2.length;
		String key2 = "amith";
		linearSearch2(arr2, n2, key2);
	}
	
	
	
	// Numbers
	static void linearSearch(int arr[], int n, int key) {
		
		int flag = 0;
		
		for(int i=0; i<n; i++) {
			
			if(arr[i] == key) {
				System.out.println("Item is found at " + i + " index");
				flag++;
			}
		}
		
		if(flag == 0)
			System.out.println("Item is not found");
	}
	
	
	
	// String
	static void linearSearch2(String arr[], int n, String key) {
		
		int flag = 0;
		
		for(int i=0; i<n; i++) {
			
			if(arr[i].equals(key)) {
				System.out.println("Item is found at " + i + " index");
				flag++;
			}
		}
		
		if(flag == 0)
			System.out.println("Item is not found");
	}

}
