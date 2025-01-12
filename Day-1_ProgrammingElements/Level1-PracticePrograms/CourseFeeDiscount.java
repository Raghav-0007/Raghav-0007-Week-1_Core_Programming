
public class CourseFeeDiscount {
    public static void main(String[] args) {
        // Declare and initialize variables
        double fee = 125000; // Total course fee in INR
        double discountPercent = 10; // Discount percentage

        // Calculate the discount amount
        double discount = (fee * discountPercent) / 100;

        // Calculate the final discounted fee
        double discountedFee = fee - discount;

        // Print the results
       System.out.println("The discount amount is INR " + discount + 
       " and the final discounted fee is INR " +       discountedFee);
    }
}

