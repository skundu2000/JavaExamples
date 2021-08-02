import java.util.ArrayList;

public class ArraylistDemo {

	public static void main(String[] args) {
		
		// Make a array list of colours
		
		ArrayList<String> clr = new ArrayList<String>();
		clr.add("Red");
		clr.add("Blue");
		clr.add("Green");
		clr.add("Yellow");
		clr.add("Black");
		
		//print the list
		
		for(int i=0 ; i<clr.size(); i++) {
			System.out.println(clr.get(i));
		}
		

	}

}
