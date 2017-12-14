package Exercises;
import java.util.Scanner;
public class SumTheDigits {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
			System.out.print("Please, enter a digit from 0 to 1000: ");
			double digit = in.nextDouble();
			double first = digit / 1000;
			digit %=1000;
			double second = digit / 100;
			digit %=100;
			double third = digit / 10;
			digit %= 10;
			double fourth = digit;
			System.out.println("The sum of the digits is " + ((int)first + (int)second +(int)third + (int)fourth));
	
		

		in.close();
		
	}

}
