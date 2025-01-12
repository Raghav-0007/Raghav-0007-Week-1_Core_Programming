import java.util.Scanner;

public class Handshakes {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // taking input from user
        System.out.print("Enter the number of students: ");
        int numberOfStudents = sc.nextInt();

        // Calculate the maximum number of handshakes
        int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        // Print the result
        System.out.println("The maximum number of handshakes among " + numberOfStudents + " students is: " + handshakes);

        // Close the Scanner object
        sc.close();
    }
}
