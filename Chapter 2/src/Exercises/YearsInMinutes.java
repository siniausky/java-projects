package Exercises;
import java.util.Scanner;
public class YearsInMinutes {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Please, enter a number of seconds: " );
		double secondsToDays = (in.nextDouble() / 365.0 );
		
		System.out.println((int)secondsToDays);
		
		
		in.close();

	}

}
