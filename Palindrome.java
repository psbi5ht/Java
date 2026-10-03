import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string to check: ");
        String original = scanner.nextLine();
        
        // Normalize the string (lowercase) to ensure case-insensitivity
        String cleanString = original.toLowerCase();
        
        int left = 0;
        int right = cleanString.length() - 1;
        boolean isPalindrome = true;
        
        // Compare characters moving from outer edges to the center
        while (left < right) {
            if (cleanString.charAt(left) != cleanString.charAt(right)) {
                isPalindrome = false;
                break; // Mismatch found, no need to check further
            }
            left++;
            right--;
        }
        
        // Print the result
        if (isPalindrome) {
            System.out.println("\"" + original + "\" is a palindrome.");
        } else {
            System.out.println("\"" + original + "\" is not a palindrome.");
        }
        
        scanner.close(); // Close the scanner resource
    }
}

