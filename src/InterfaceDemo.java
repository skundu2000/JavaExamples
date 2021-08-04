
interface AnimalWorld{
	public void type();
	public void food();
	
}



 class World implements AnimalWorld {
	
	public void type() {
		System.out.println("animal type: dog");
	}
	public void food() {
		System.out.println("dog food ");
		
	}}
	
public class InterfaceDemo {
	public static void main(String[] args ){
		
		World ob = new World();
		ob.food();
		ob.type();
			
			
		}
		
	}

