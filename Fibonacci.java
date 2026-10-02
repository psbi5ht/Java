import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of terms: ");
        int terms = scanner.nextInt();
        
        if (terms <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            System.out.println("Fibonacci Series:");
            
            long firstTerm = 0;
            long secondTerm = 1;
            
            for (int i = 1; i <= terms; i++) {
                System.out.print(firstTerm + (i < terms ? ", " : ""));
                
                long nextTerm = firstTerm + secondTerm;
                firstTerm = secondTerm;
                secondTerm = nextTerm;
            }
            System.out.println();
        }
        
        scanner.close();
    }
}
