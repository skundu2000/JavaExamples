import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		
		//create a HashMap object
	 HashMap<String , Integer> map = new HashMap<String , Integer>();
	 
	 //add key value pair
	 map.put("John", 30);
	 map.put("Chris" , 35);
	 map.put("Mohit" , 50);
	 
	 for(String i : map.keySet()) {
		 System.out.println(i + ":" +map.get(i));
	 }
	 
	}

}
