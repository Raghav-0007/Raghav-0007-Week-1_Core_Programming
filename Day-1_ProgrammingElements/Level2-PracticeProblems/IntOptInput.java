import java.util.Scanner;

public class IntOptInput {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // taking input from user
        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();

        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();

        System.out.print("Enter the value of c: ");
        int c = sc.nextInt();

        // Perform the integer operations
        int result1 = a + b * c; 
        int result2 = a * b + c; 
        int result3 = c + a / b; 
        int result4 = a % b + c; 

        // Print the result
        System.out.println("The results of Int Operations are:" + result1 + result2 + result3 + result4);

        // Close the Scanner object
        sc.close();
    }
}