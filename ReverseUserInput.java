import java.util.Scanner; // Import the Scanner class to read user input

public class ReverseUserInput {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string to reverse: ");
        String original = scanner.nextLine(); // Read the string entered by the user
        
        String reversed = "";
        
        // Loop backwards starting from the last index down to 0
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i); // Extract character and append
        }
        
        // Print out the results
        System.out.println("Original String: " + original);
        System.out.println("Reversed String: " + reversed);
        
        scanner.close(); // Close the scanner to release resources
    }
}

