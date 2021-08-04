abstract class Animal{
	public abstract void animalType();
	
	public static void animalFood(String food) {
		System.out.println(food);
	}
	
}

 class Cat extends Animal{
	
	public  void animalType() {
		System.out.println("Animal type: Cat");
		
	}
	
}


public class AbstractClassDemo {
	public static void main(String args[]) {
		
		Cat ob = new Cat();
		ob.animalType();
		ob.animalFood("salmon  ");
		
		
	}

}
