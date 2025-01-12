import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Take the number from the user
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // print the multiplication table from 6 to 9
        for (int i = 6; i <= 9; i++) {
            
            System.out.println(number + " * " + i + " = " + (number * i));
        }

        // Close the scanner
        input.close();
    }
}
