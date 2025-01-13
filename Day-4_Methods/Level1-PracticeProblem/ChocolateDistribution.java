import java.util.Scanner;

public class ChocolateDistribution {

    // Method to distribute chocolates among children
    public static int[] findRemainderAndQuotient(int chocolates, int children) {
        int eachChild = chocolates / children;
        int remaining = chocolates % children;
        return new int[]{eachChild, remaining};
    }

    public static void main(String[] args) {
		
		// scanner class object for taking input
        Scanner scanner = new Scanner(System.in);
		
		//Taking input from user
        System.out.print("Enter total chocolates: ");
        int chocolates = scanner.nextInt();
        System.out.print("Enter number of children: ");
        int children = scanner.nextInt();

         // print the result
        int[] result = findRemainderAndQuotient(chocolates, children);
        System.out.println("Each child gets: " + result[0] + " chocolates");
        System.out.println("Remaining chocolates: " + result[1]);
        scanner.close();
    }
}
