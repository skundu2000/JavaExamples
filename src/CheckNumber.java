
import java.util.Scanner;

public class CheckNumber {
	
//method to check number is positive , negative or zero
	public static void myMethod(int x) {

		if(x>0) {
			System.out.println(x+ " is a positive number: ");
		}
		else if(x<0) {
			System.out.println(x+ " is a negative number: ");
		}
		else {
			System.out.println("the number is zero");
		}
	}

	public static void main(String[] args) {
		
		//Enter a number from keyboard to check number is positive ,negative or zero
		System.out.println("Enter a number from keyboard");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
				
		//call method
		myMethod(num);




	}

}

