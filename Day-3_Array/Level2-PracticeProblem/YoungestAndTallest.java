import java.util.Scanner;

public class YoungestAndTallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define arrays to store the age and height of the three friends
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Taking input for age and height for each friend
        String[] names = {"Amar", "Akbar", "Anthony"};
        
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age for " + names[i] + ": ");
            ages[i] = scanner.nextInt();
            
            System.out.print("Enter height for " + names[i] + ": ");
            heights[i] = scanner.nextDouble();
        }

        // Find the youngest and tallest
        int youngestIndex = 0; // Assume Amar is the youngest initially
        int tallestIndex = 0;  // Assume Amar is the tallest initially

        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;  // Update if current friend is younger
            }

            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;  // Update if current friend is taller
            }
        }

        // Display the results
        System.out.println("The youngest friend is: " + names[youngestIndex]);
        System.out.println("The tallest friend is: " + names[tallestIndex]);

        scanner.close();
    }
}
