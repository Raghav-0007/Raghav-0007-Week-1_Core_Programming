import java.util.Scanner;

public class MeanHeight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Define an array to store the heights of 11 players
        double[] heights = new double[11];
        double sum = 0.0;
        
        // Take height input for each player
        System.out.println("Enter the heights of 11 football players in centimeters:");
        for (int i = 0; i < 11; i++) {
            System.out.print("Player " + (i + 1) + " height: ");
            heights[i] = scanner.nextDouble();  // Store input in the array
            sum += heights[i];  // Add to the sum
        }
        
        // Calculate the mean height
        double meanHeight = sum / 11;
        
        // Display the mean height
        System.out.println("The mean height of the football team is: " + meanHeight + " cm");
        
        scanner.close();
    }
}
