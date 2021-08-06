import java.util.HashMap;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap <String , Integer>ob = new HashMap<String , Integer>();
		ob.put("Raman", 30);
		ob.put("Gita", 32);
		ob.put("Chris", 40);
		ob.put("John", 28);

		System.out.println(ob);
		
		// Remove an item
		ob.remove("John");

		// how many items
		System.out.println(ob.size());

		// get the value
		System.out.println(ob.get("Raman"));

		//to get only keys
		for(String x : ob.keySet()) {
			System.out.println(x);
		}

		//to get only values
		for(int y : ob.values()) {
			System.out.println(y);
		}
			// to print keys and values

		for(String i : ob.keySet()) {			
			System.out.println(i +":"+ob.get(i));
		}								
			
		
	}
}
