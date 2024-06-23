// HashSet - Contains only unique elements no duplicate elements

package arrays;

import java.util.HashSet;
import java.util.Iterator;

public class P11_1 {
	public static void main(String[] args) {
		
		// Creation
		HashSet<Integer> set = new HashSet<>();
		
		
		// Insertion
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(1);
		
		System.out.println(set);
		
		
		// Size
		System.out.println("Size = " + set.size());
		
		
		// Search
		System.out.println(set.contains(1));
		
		
		// delete
		set.remove(1);
		System.out.println(set);
		
		
		// Iterator
		Iterator<Integer> it = set.iterator();
		
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		
		
		System.out.println();
		
		
		// Using for-each loop
		for(int val : set)
			System.out.print(val + " ");
	}
	

}
