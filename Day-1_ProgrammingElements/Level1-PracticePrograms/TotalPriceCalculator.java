import java.util.Scanner;

public class TotalPriceCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // taking input from user
        System.out.println("Enter the unit price of the item ");
        double unitPrice = sc.nextDouble();
      
        System.out.println("Enter the quantity");
        int quantity = sc.nextInt();

        // Calculate the total price
        double totalPrice = unitPrice * quantity;

        // Print the results
        System.out.println("The total purchase price is " + totalPrice + " if the quantity is " + quantity + " and unit price is " + unitPrice);

        // Close the Scanner object
        sc.close();
    }
}
