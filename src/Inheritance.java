
class Vehicle{

	public void color() {
		System.out.println("Red, inside vehicle class");
	}

}

class Car extends Vehicle{

	public void color() {
		//super
		super.color();
		
	}
	public void engine() {

		System.out.println("electric, inside Car class");
	}
}

public class Inheritance {

	public static void main(String[] args) {

		Car ob = new Car();
		ob.color();

	}

}

