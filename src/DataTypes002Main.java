import java.util.Scanner;

public class DataTypes002Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input a value for inch: ");
		double inch = input.nextDouble();
		input.close();
		
		double result = inchToMeter(inch);
		System.out.println(inch + " inch is " + result + " meters");
	}

	private static double inchToMeter(double inch) {
		return inch * 0.0254d;
	}

}
