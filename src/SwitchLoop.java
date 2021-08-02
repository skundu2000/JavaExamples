
public class SwitchLoop {
	
	//create a method to select any weekdays
	
	public static void switchMethod(String day) {
		
		String value = day.toLowerCase();
		
		switch(value) {
		case "monday" :
			System.out.println("Selected day: "+value);
			break;
		case "tuesday" :
			System.out.println("Selected day: "+value);
			break;
		case "wednesday" :
			System.out.println("Selected day: "+value);
			break;
		case "thursday" :
			System.out.println("Selected day: "+value);
			break;
		case "friday" :
			System.out.println("Selected day: "+value);
			break;	
		default:
			System.out.println("select any week days");
			
		}
		
		
		
	}

	public static void main(String[] args) {
		
		// call the method with different arguments.
		
		switchMethod("tuesday");
		switchMethod("Friday");
		switchMethod("sunday");
		

	}

}


