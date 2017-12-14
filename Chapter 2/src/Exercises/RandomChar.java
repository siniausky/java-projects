package Exercises;
import java.util.Scanner;
public class RandomChar {
//page 113
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Ente an integer between 0 and 127___: ");
		int a = in.nextInt();
		System.out.println((char)a);
		
in.close();

	}
}

