import java.util.Scanner;

public class ToggleCase {

    // Method to toggle the case of each character
    public static String toggleCase(String input) {
        StringBuilder toggled = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // Check if the character is uppercase
            if (Character.isUpperCase(ch)) {
                toggled.append(Character.toLowerCase(ch));  // Convert to lowercase
            }
            // Check if the character is lowercase
            else if (Character.isLowerCase(ch)) {
                toggled.append(Character.toUpperCase(ch));  // Convert to uppercase
            }
            // If not a letter, keep it as it is
            else {
                toggled.append(ch);
            }
        }

        return toggled.toString();
    };

public static void main(String[] args){

// create a Scanner class object for taking input
Scanner sc = new Scanner(System.in);

// taking input from user
System.out.println("Enter the string");
String str=sc.next();

// print the result
String result=toggleCase(str);
System.out.println("the toggled string is: " + result);
}
}
