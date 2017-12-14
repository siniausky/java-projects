package Exercises;
import java.util.Scanner;
public class DistanceOfTwoPoints {

	public static void main(String[] args) {
		Scanner in  = new Scanner(System.in);
		System.out.println("Enter x1 and y1: ");
		double x1 = in.nextDouble();
		double y1 = in.nextDouble();
		System.out.println("Enter x2 and y2: ");
		double x2 = in.nextDouble();
		double y2 = in.nextDouble();
		double distance= Math.pow((x2-x1) * (x2 - x1) + ( y2 - y1) * (y2 - y1), 0.5);
		System.out.println("The distance between two points is " + distance);
		in.close(); 
	}

}
