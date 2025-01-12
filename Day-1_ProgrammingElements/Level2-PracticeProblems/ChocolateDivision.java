import java.util.Scanner;

public class ChocolateDivision {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // taking input from user
        System.out.print("Enter the number of chocolates: ");
        int numberOfChocolates = input.nextInt();

        System.out.print("Enter the number of children: ");
        int numberOfChildren = input.nextInt();

        // Calculate the number of chocolates each child gets
        int chocolatesPerChild = numberOfChocolates / numberOfChildren;

        // Calculate the remaining chocolates
        int remainingChocolates = numberOfChocolates % numberOfChildren;

        // Print the results
        System.out.println("The number of chocolates each child gets is " + chocolatesPerChild +
                           " and the number of remaining chocolates are " + remainingChocolates);

        // Close the Scanner object
        input.close();
    }
}
