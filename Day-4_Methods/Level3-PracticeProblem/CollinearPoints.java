import java.util.Scanner;

public class CollinearPoints {
    public static void main(String[] args) {
		// creating the scanner object
		Scanner input = new Scanner(System.in);
		
        // Input coordinates
		System.out.println("Enter x1 and y1: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();

        System.out.println("Enter x2 and y2: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
		
		System.out.println("Enter x3 and y3: ");
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
		
        // Check collinearity using slope
        if (areCollinearUsingSlope(x1, y1, x2, y2, x3, y3)) {
            System.out.println("Points are collinear (using slope formula).");
        } else {
            System.out.println("Points are not collinear (using slope formula).");
        }

        // Check collinearity using area
        if (areCollinearUsingArea(x1, y1, x2, y2, x3, y3)) {
            System.out.println("Points are collinear (using area formula).");
        } else {
            System.out.println("Points are not collinear (using area formula).");
        }
		
		// Closing the scanner resource
		input.close();
    }
	
	public static boolean areCollinearUsingSlope(double x1, double y1, double x2, double y2, double x3, double y3) {
        // Calculate slopes
        double slopeAB = (y2 - y1) / (x2 - x1);
        double slopeBC = (y3 - y2) / (x3 - x2);
        double slopeAC = (y3 - y1) / (x3 - x1);

        // Check if slopes are equal
        return (slopeAB == slopeBC) && (slopeBC == slopeAC);
    }

    public static boolean areCollinearUsingArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        // Calculate area of triangle
        double area = Math.abs(0.5 * ((x1 * (y2 - y3)) + (x2 * (y3 - y1)) + (x3 * (y1 - y2))));

        // Check if area is zero
        return area == 0;
    }
}