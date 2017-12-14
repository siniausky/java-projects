package Exercises;
import java.util.Scanner;
public class FinancialApplication {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter empoyee's name: ");
		String name = in.nextLine();
		System.out.print("\n Enter number of hours worked in a week: ");
		double hours = in.nextDouble();
		System.out.print("\n Enter hourly pay rate: ");
		double rate = in.nextDouble();
		System.out.print("\nEnter federal tax witholding rate: ");
		double fTax = in.nextDouble();
		System.out.print("\nEnter state tax witholding rate:");
		double sTax = in.nextDouble();
	
		System.out.print("\nEmployee name: " +name);
		System.out.print("\nHoursworked: " + hours);
		System.out.print("\n Pay rate: $" + rate);
		double grosspay = hours * rate;
		System.out.print("Gross pay: $" + grosspay);
		System.out.print("\nDeductions: "); 
		double fedWith = grosspay * fTax;
		System.out.print("\n\t Federal witholding" + (int)(fTax * 100) + ": " + fedWith);
		double stWith = grosspay * sTax;
		System.out.print("\n\t State witholding" + (int)(sTax * 100) + ": " + stWith);
		System.out.print("\n\tTotal deduction:  $" + (fedWith + stWith));
		System.out.print("\nNet pay:\t" + (grosspay - (fedWith + stWith)));

		
		in.close();
	}

}
