import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input for the number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        // Create arrays to store marks, percentages, and grades
        double[][] marks = new double[numberOfStudents][3]; // marks[i][0] = physics, marks[i][1] = chemistry, marks[i][2] = maths
        double[] percentages = new double[numberOfStudents];
        String[] grades = new String[numberOfStudents];

        // Take input for marks in Physics, Chemistry, and Maths
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("\nEnter marks for student " + (i + 1) + ":");

            // Input for Physics marks (positive value check)
            double physicsMarks;
            do {
                System.out.print("Physics marks: ");
                physicsMarks = scanner.nextDouble();
                if (physicsMarks < 0) {
                    System.out.println("Please enter a positive value for Physics marks.");
                }
            } while (physicsMarks < 0);
            marks[i][0] = physicsMarks;

            // Input for Chemistry marks (positive value check)
            double chemistryMarks;
            do {
                System.out.print("Chemistry marks: ");
                chemistryMarks = scanner.nextDouble();
                if (chemistryMarks < 0) {
                    System.out.println("Please enter a positive value for Chemistry marks.");
                }
            } while (chemistryMarks < 0);
            marks[i][1] = chemistryMarks;

            // Input for Maths marks (positive value check)
            double mathsMarks;
            do {
                System.out.print("Maths marks: ");
                mathsMarks = scanner.nextDouble();
                if (mathsMarks < 0) {
                    System.out.println("Please enter a positive value for Maths marks.");
                }
            } while (mathsMarks < 0);
            marks[i][2] = mathsMarks;
        }

        // Calculate percentage and grade for each student
        for (int i = 0; i < numberOfStudents; i++) {
            // Calculate the total marks and percentage
            double totalMarks = marks[i][0] + marks[i][1] + marks[i][2];
            percentages[i] = (totalMarks / 300) * 100;  // Percentage = (totalMarks / totalMaximumMarks) * 100

            // Determine the grade based on the percentage
            if (percentages[i] >= 80) {
                grades[i] = "Grade A";
            } else if (percentages[i] >= 60) {
                grades[i] = "Grade B";
            } else if (percentages[i] >= 40) {
                grades[i] = "Grade C";
            } else {
                grades[i] = "Grade D";
            }
        }

        // Display the marks, percentage, and grade of each student
        System.out.println("\nStudent Results:");
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("\nStudent " + (i + 1) + ":");
            System.out.println("Physics Marks: " + marks[i][0]);
            System.out.println("Chemistry Marks: " + marks[i][1]);
            System.out.println("Maths Marks: " + marks[i][2]);
            System.out.println("Percentage: " + String.format("%.2f", percentages[i]) + "%");
            System.out.println("Grade: " + grades[i]);
        }

        scanner.close();
    }
}
