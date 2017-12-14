package Exercises;
import javax.swing.JOptionPane;
class ComputeArea {

	public static void main(String[] args) {
	Double radius = Double.parseDouble(JOptionPane.showInputDialog("Please, enter the radius"));
	if (radius < 0) {
		JOptionPane.showMessageDialog(null, "Incorrect input");
	}
	else {
		double area = radius * radius * 3.14159;
		JOptionPane.showMessageDialog(null, ("Area is " + area));
	}

	}

}
