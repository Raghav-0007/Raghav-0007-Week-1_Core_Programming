// Program to demonstrate NullPointerException generation and handling

public class NullPointerDemo {
    
    // Method to generate NullPointerException
    public static void generateNullPointerException() {
        String text = null;
        // This will throw NullPointerException
        System.out.println(text.length());
    }
    
    // Method to handle NullPointerException using try-catch block
    public static void handleNullPointerException() {
        String text = null;
        try {
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }
    
    // Main method to call both methods
    public static void main(String[] args) {
        // Calling method to generate NullPointerException (Uncomment to test)
        // generateNullPointerException();
        
        // Calling method to handle NullPointerException
        handleNullPointerException();
    }
}
