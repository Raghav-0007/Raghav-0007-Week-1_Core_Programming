import java.util.Scanner;

public class CourseFeeDiscount2 {
    public static void main(String[] args) {
		
		// create a scanner object for taking input
		Scanner sc = new Scanner(System.in);
		
		// taking fee and Discount percentage as input
		System.out.println("Enter your fee");       
        double fee = sc.nextDouble();
		
		System.out.println("Enter the discount percentage"); 
        double discountPercent = sc.nextDouble(); 

        // Calculate the discount amount
        double discount = (fee * discountPercent) / 100;

        // Calculate the final discounted fee
        double discountedFee = fee - discount;

        // Print the results
       System.out.println("The discount amount is INR " + discount + 
       " and the final discounted fee is INR " + discountedFee);
    }
}

