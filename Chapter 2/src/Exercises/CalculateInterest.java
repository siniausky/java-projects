package Exercises;
import java.util.Scanner;
public class CalculateInterest {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter balance and interest rate (e.g. 3 for 3%) ");
		double balance = in.nextDouble();
		double rate = in.nextDouble();
		double interest = (int) (balance * (rate / 1200 *1000000))/1000000.0;
		System.out.println("The interest is " + interest);

		in.close();
	}

}
