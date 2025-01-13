import java.util.Scanner;

public class GradeOfStudent {
    public static void main(String[] args) {
		// Initializing scanner object
        Scanner input = new Scanner(System.in);

        // Take input for the number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        // Generate random scores
        int[][] scores = generateRandomScores(numberOfStudents);

        // Calculate total, average, and percentage
        double[][] results = calculateResults(scores);

        // Display the scorecard
        displayScoreCard(scores, results);

		// closing scanner resource
        input.close();
    }

    // Method to generate random 2-digit scores for PCM for all students
    public static int[][] generateRandomScores(int numberOfStudents) {
        int[][] scores = new int[numberOfStudents][3]; // [students][PCM]

        for (int i = 0; i < numberOfStudents; i++) {
            scores[i][0] = (int)(Math.random() * 100);
            scores[i][1] = (int)(Math.random() * 100);
            scores[i][2] = (int)(Math.random() * 100);
        }
		
        return scores;
    }

    // Method to calculate total, average, and percentage for each student
    public static double[][] calculateResults(int[][] scores) {
        int numberOfStudents = scores.length;
        double[][] results = new double[numberOfStudents][3]; // [students][Total, Average, Percentage]

        for (int i = 0; i < numberOfStudents; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            // Round off to 2 decimal places
            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0;
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return results;
    }

    // Method to display the scorecard in tabular format
    public static void displayScoreCard(int[][] scores, double[][] results) {
        System.out.println();
        System.out.println("Student\tPhysics\tChemistry\tMath\tTotal\tAverage\tPercentage");
        System.out.println();

        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%d\t%d\t%d\t\t%d\t%.0f\t%.2f\t%.2f%n",
                    (i + 1), scores[i][0], scores[i][1], scores[i][2], results[i][0], results[i][1], results[i][2]);
        }

        System.out.println();
    }
}
