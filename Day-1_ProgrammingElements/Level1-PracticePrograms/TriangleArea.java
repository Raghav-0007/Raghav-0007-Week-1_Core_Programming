import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // taking input from user
        System.out.print("Enter the base of the triangle in inches: ");
        double baseInches = sc.nextDouble();

        System.out.print("Enter the height of the triangle in inches: ");
        double heightInches = sc.nextDouble();

        // Calculate the area in square inches
        double areaInches = 0.5 * baseInches * heightInches;

        // Calculate the area in square centimeters
        double areaCm = areaInches * 6.4516;

        // Print the results
        System.out.println("The area of the triangle is " + areaInches + " square inches.");
        System.out.println("The area of the triangle in square centimeters is " + areaCm + " square cm.");

        // Close the Scanner object
        sc.close();
    }
}
