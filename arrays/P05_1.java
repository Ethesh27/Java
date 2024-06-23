// Hashing

package arrays;

import java.util.*;

public class P05_1 {
	public static void main(String[] args) {
		
		// Creation
		HashMap<String, Integer> map = new HashMap<>();
		
		
		// Insertion
		map.put("India", 150);
		map.put("USA", 30);
		map.put("China", 120);
		
		System.out.println(map);
		
		map.put("China", 180);
		System.out.println(map);
		
		
		
		// Search or Lookup
		System.out.println(map.containsKey("India"));
		System.out.println(map.containsKey("UAE"));
		
		
		System.out.println(map.get("USA"));		// key exist
		System.out.println(map.get("UAE"));		// key do not exist
		
		
		
		// Traverse or Iteration
		for(Map.Entry<String, Integer> e : map.entrySet()) {
			System.out.println(e.getKey() + " - " + e.getValue());
		}
		
		
	}

}
