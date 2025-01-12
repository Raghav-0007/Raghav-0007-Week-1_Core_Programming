import java.util.Scanner;

public class YoungestAndTallestFriends {
    public static void main(String[] args) {
        // Create a Scanner object for taking input
        Scanner input = new Scanner(System.in);
        
        // Take input for ages
        System.out.print("Enter Amar's age: ");
        int amarAge = input.nextInt();
        
        System.out.print("Enter Akbar's age: ");
        int akbarAge = input.nextInt();
        
        System.out.print("Enter Anthony's age: ");
        int anthonyAge = input.nextInt();
        
        // Take input for heights
        System.out.print("Enter Amar's height in cm: ");
        int amarHeight = input.nextInt();
        
        System.out.print("Enter Akbar's height in cm: ");
        int akbarHeight = input.nextInt();
        
        System.out.print("Enter Anthony's height in cm: ");
        int anthonyHeight = input.nextInt();
        
        // Find the youngest friend by finding the minimum age
        int youngestAge = Math.min(amarAge, Math.min(akbarAge, anthonyAge));
        String youngestFriend = "";
        if (youngestAge == amarAge) {
            youngestFriend = "Amar";
        } else if (youngestAge == akbarAge) {
            youngestFriend = "Akbar";
        } else {
            youngestFriend = "Anthony";
        }
        
        // Find the tallest friend by finding the maximum height
        int tallestHeight = Math.max(amarHeight, Math.max(akbarHeight, anthonyHeight));
        String tallestFriend = "";
        if (tallestHeight == amarHeight) {
            tallestFriend = "Amar";
        } else if (tallestHeight == akbarHeight) {
            tallestFriend = "Akbar";
        } else {
            tallestFriend = "Anthony";
        }
        
        // Display results
        System.out.println("The youngest friend is " + youngestFriend + " with age " + youngestAge);
        System.out.println("The tallest friend is " + tallestFriend + " with height " + tallestHeight + " cm");
        
        // Close the scanner object
        input.close();
    }
}
