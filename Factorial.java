import java.util.Scanner; // Required to read user input

public class Factorial {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the keyboard
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = input.nextInt(); // Reads the integer entered by the user
        
        long factorial = 1;

        // Calculate the factorial using a loop
        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }

        System.out.println("Factorial of " + number + " is: " + factorial);
        
        input.close(); // Close the scanner to free up resources
    }
}

