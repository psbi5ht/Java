import java.util.Scanner;

public class Overloading {

    // 1. PARENT CLASS (Defined inside the main class to avoid duplicate name errors)
    static class Base {
        void show(int a) {
            System.out.println("-> Parent Class method executed: " + a);
        }
    }

    // 2. CHILD CLASS 
    static class Child extends Base {
        // Overloads the parent's show method with a 2-parameter version
        void show(int a, int b) {
            System.out.println("-> Child Class method executed: " + a + " and " + b);
        }
    }

    // 3. MAIN METHOD
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Creating an object of the Child class
        Child obj = new Child();

        System.out.println("=== Parent-Child Overloading Demo ===");
        System.out.println("Select an option:");
        System.out.println("1. Enter 1 number (Triggers Parent Method)");
        System.out.println("2. Enter 2 numbers (Triggers Both Parent & Child Methods)");
        System.out.print("Your choice: ");
        
        // Check if input is an integer to prevent crashes
        if (!scanner.hasNextInt()) {
            System.out.println("Error: Please enter a valid number selection.");
            scanner.close();
            return;
        }
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.print("Enter your number: ");
            int num1 = scanner.nextInt();
            
            System.out.println("\n--- OUTPUT FOR 1 INPUT ---");
            obj.show(num1); // Calls the inherited 1-input version from Parent
            
        } else if (choice == 2) {
            System.out.print("Enter first number: ");
            int num1 = scanner.nextInt();
            
            System.out.print("Enter second number: ");
            int num2 = scanner.nextInt();

            System.out.println("\n--- OUTPUT SHOWING BOTH METHODS ---");
            obj.show(num1);       // Triggers Parent class version
            obj.show(num1, num2); // Triggers Child class extension version
            
        } else {
            System.out.println("\nInvalid selection! Please choose 1 or 2.");
        }

        scanner.close();
    }
}
