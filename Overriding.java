import java.util.Scanner;

class Parent {
    void printNumber(int num) {
        System.out.println("Parent version prints: " + num);
    }
}

class Child extends Parent {
    // Overriding: Same name + Same inputs
    @Override
    void printNumber(int num) {
        System.out.println("Child version prints: " + num);
    }
}

public class Overriding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int userInput = scanner.nextInt();

        System.out.println("\n--- OUTPUT SHOWING BOTH CLASSES ---");

        // 1. Pointing to Parent Object
        Parent parentObj = new Parent(); 
        parentObj.printNumber(userInput); // Runs Parent's method

        // 2. Pointing to Child Object
        Parent childObj = new Child(); 
        childObj.printNumber(userInput); // Runs Child's method

        scanner.close();
    }
}