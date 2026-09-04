import java.util.Scanner; // 1. Import the Scanner class

public class SumNumbers {
    public static void main(String[] args) {
        // 2. Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        // 3. Prompt the user and read the first number
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        
        // 4. Prompt the user and read the second number
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        
        // 5. Calculate the sum
        int sum = num1 + num2;
        
        // 6. Display the result
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
        
        // 7. Close the scanner to prevent memory leaks
        scanner.close();
    }
}

