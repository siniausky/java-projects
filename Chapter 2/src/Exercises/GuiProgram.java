package Exercises;
import javax.swing.JOptionPane;
public class GuiProgram {

	public static void main(String[] args) {
	String name = (JOptionPane.showInputDialog( "Enter empoyee's name: " ));
	Double hours = Double.parseDouble(JOptionPane.showInputDialog("\n Enter number of hours worked in a week: "));
	Double rate = Double.parseDouble(JOptionPane.showInputDialog("\n Enter hourly pay rate: "));
	Double fTax = Double.parseDouble(JOptionPane.showInputDialog("\nEnter federal tax witholding rate: "));
	Double sTax	= Double.parseDouble(JOptionPane.showInputDialog("\nEnter state tax witholding rate:"));
	double grosspay = hours * rate;
	double fedWith = grosspay * fTax;
	double stWith = grosspay * sTax;
	JOptionPane.showMessageDialog(null,("\nEmployee name: " + name + ("\nHoursworked: " + hours) 
									+ ("\n Pay rate: $" + rate) + ("Gross pay: $" + grosspay) +
									("\nDeductions: ") + ("\n\t Federal witholding" + (int)(fTax * 100) + ": " + fedWith) +
									("\n\t State witholding" + (int)(sTax * 100) + ": " + stWith) +
									("\n\tTotal deduction:  $" + (fedWith + stWith)) +
									("\nNet pay:\t" + (grosspay - (fedWith + stWith))))); 
//		System.out.print("\nEmployee name: " +name);
//		System.out.print("\nHoursworked: " + hours);
//		System.out.print("\n Pay rate: $" + rate);
//		double grosspay = hours * rate;
//		System.out.print("Gross pay: $" + grosspay);
//		System.out.print("\nDeductions: "); 
//		double fedWith = grosspay * fTax;
//		System.out.print("\n\t Federal witholding" + (int)(fTax * 100) + ": " + fedWith);
//		double stWith = grosspay * sTax;
//		System.out.print("\n\t State witholding" + (int)(sTax * 100) + ": " + stWith);
//		System.out.print("\n\tTotal deduction:  $" + (fedWith + stWith));
//		System.out.print("\nNet pay:\t" + (grosspay - (fedWith + stWith)));

		
	}

}
