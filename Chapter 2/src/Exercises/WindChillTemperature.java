package Exercises;
import java.util.Scanner;
public class WindChillTemperature {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
//prompt user to enter temperature  in F
		System.out.print("Enter the temperature in Farenheit:");
		double temp = in.nextDouble();
// prompt user to enter wind speed per hour'
		System.out.print("Enter the wind spees in  miles per hour :");
		double wind = in.nextDouble();
//calculate and print wind chill index
		double windchill = 35.74 + (0.6215 * temp) - (35.75 * Math.pow(wind, 0.16) + (0.4275 * temp * Math.pow(wind, 0.16) ));
		System.out.println("The windchill index is" +(int)windchill);
		in.close();
	}

}
