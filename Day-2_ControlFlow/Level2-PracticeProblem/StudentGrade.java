import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        // Create Scanner object for taking input from user
        Scanner scanner = new Scanner(System.in);
        
        // Declare variables for subject marks
        double physics, chemistry, maths;
        
        // Input marks for each subject
        System.out.print("Enter marks for Physics: ");
        physics = scanner.nextDouble();

        System.out.print("Enter marks for Chemistry: ");
        chemistry = scanner.nextDouble();

        System.out.print("Enter marks for Maths: ");
        maths = scanner.nextDouble();
        
        // Calculate the total marks and percentage
        double totalMarks = physics + chemistry + maths;
        double percentage = (totalMarks / 300) * 100;
        
        // Calculate average
        double average = totalMarks / 3;

        // Determine grade and remarks
        String grade;
        String remarks;

        if (percentage >= 75) {
            grade = "A";
            remarks = "Excellent";
        } else if (percentage >= 60) {
            grade = "B";
            remarks = "Good";
        } else if (percentage >= 50) {
            grade = "C";
            remarks = "Average";
        } else if (percentage >= 40) {
            grade = "D";
            remarks = "Needs Improvement";
        } else {
            grade = "F";
            remarks = "Fail";
        }

        // Display the results
        System.out.println("\nTotal Marks: " + totalMarks + "/300");
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Average Marks: " + average);
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);
        
        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
