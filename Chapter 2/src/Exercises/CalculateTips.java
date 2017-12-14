package Exercises;
import java.util.Scanner;
public class CalculateTips {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print ("Please, enter the subtotal and gratuity rate: ");
		double subtotal =in.nextDouble();
		double gratuity = (in.nextDouble())/100.0;
		System.out.println("The gratuity is " + subtotal * gratuity + " and"
				+ " the total is $" + (subtotal + (subtotal * gratuity)));
		//the correct amount was only right after I placed the variables manipulations 
		//within brackets
		in.close();
	}

}
