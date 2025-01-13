import java.util.Scanner;

public class LineEquation {
    public static void main(String[] args) {
		// Creating the scanner object
        Scanner input = new Scanner(System.in);

        System.out.print("Enter x1: ");
        double x1 = input.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = input.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = input.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = input.nextDouble();

        // Calculate distance
        double distance = calculateDistance(x1, y1, x2, y2);
        System.out.println("Euclidean Distance: " + distance);

        // Find line equation
        double[] equation = findLineEquation(x1, y1, x2, y2);
        double slope = equation[0];
        double yIntercept = equation[1];
        System.out.println("Equation of the line: y = " + slope + "x + " + yIntercept);

		// closing the scanner object
        input.close();
    }
	
	
    public static double calculateDistance(double x1, double y1, double x2, double y2) {
        // Calculate Euclidean distance
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static double[] findLineEquation(double x1, double y1, double x2, double y2) {
        // Calculate slope (m)
        double m = (y2 - y1) / (x2 - x1);
        // Calculate y-intercept (b)
        double b = y1 - m * x1;

        // Return an array containing slope and y-intercept
        return new double[]{m, b};
    }
}