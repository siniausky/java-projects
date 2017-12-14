package Exercises;
import java.util.Scanner;

public class VolumeOfACylinder {

	public static void main(String[] args) {
		final double pi = 3.14159;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the radius and the length of a cylinder");
		double radius = in.nextDouble();
		double length = in.nextDouble();
		double area = (int)(radius * radius * pi * 1000) / 1000.0;
		double volume = area * length;
		System.out.print("The area is :" + area);
		System.out.println("The volume is : " + volume);
		in.close();
	}

}
