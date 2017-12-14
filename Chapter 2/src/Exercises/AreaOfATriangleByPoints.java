package Exercises;
import java.util.Scanner;
public class AreaOfATriangleByPoints {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long x1, x2, x3;
		System.out.print("Enter three points for a triangle: ");
		x1 = in.nextLong();
		System.out.print("Enter three points for a triangle: ");
		System.out.print("Enter three points for a triangle: ");
		x2 = in.nextLong();
		System.out.print("Enter three points for a triangle: ");
		System.out.print("Enter three points for a triangle: ");
		x3 = in.nextLong();
		System.out.print("Enter three points for a triangle: ");
		long side1 = Math.abs( x1-x3); //length of one side
		long side2 = Math.abs (x2-x1); //length of second side
		long side3  = Math.abs(x3 - x2); //length of third side
		System.out.println(side1);
		System.out.println(side2);
		System.out.println(side3);
		long s = (side1 + side2 +side3) / 2;
		long area =(s *  (s - side1) * (s - side2) * (s - side3));
		System.out.println(s);
		System.out.println(area);

	in.close();
	}

}
