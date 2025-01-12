public class DividePens {
    public static void main(String[] args) {
        // Total number of pens
        int totalPens = 14;

        // Total number of students
        int students = 3;

        // Calculate pens per student using division operator
        int pensPerStudent = totalPens / students;

        // Calculate remaining pens using modulus operator
        int remainingPens = totalPens % students;

        // Print the results
        System.out.println("The Pens Per Student is " + pensPerStudent + 
                           " and the remaining pens not distributed is " + remainingPens);
    }
}

