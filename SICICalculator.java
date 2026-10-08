import java.util.Scanner;

public class SICICalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== SI & CI Growth & Maturity Calculator ===");
        
        // 1. Input Gathering
        System.out.print("Enter Principal amount (P): ");
        double principal = scanner.nextDouble();
        
        System.out.print("Enter Annual Interest Rate (R%): ");
        double rate = scanner.nextDouble();
        
        System.out.print("Enter Time period in years (T): ");
        double time = scanner.nextDouble();
        
        // Compounding Frequency Menu Selection
        System.out.println("\nSelect Compounding Frequency for Compound Interest:");
        System.out.println("1. Yearly (Annually)");
        System.out.println("2. Half-Yearly (Semi-Annually)");
        System.out.println("3. Quarterly");
        System.out.print("Enter choice (1-3): ");
        int choice = scanner.nextInt();
        
        int n = 1; // Number of compounding periods per year
        String frequencyText = "Yearly";
        
        switch (choice) {
            case 2:
                n = 2;
                frequencyText = "Half-Yearly";
                break;
            case 3:
                n = 4;
                frequencyText = "Quarterly";
                break;
            default:
                System.out.println("Invalid choice. Defaulting to Yearly compounding.");
                break;
        }
        
        // 2. Interest and Maturity Calculations
        // Simple Interest Calculations
        double si = (principal * rate * time) / 100;
        double totalAmountSI = principal + si;
        
        // Compound Interest Calculations factoring in frequency (n)
        // Formula: Amount = P * (1 + R / (100 * n)) ^ (n * T)
        double totalAmountCI = principal * Math.pow((1 + (rate / (100 * n))), (n * time));
        double ci = totalAmountCI - principal;
        
        // 3. Formatted Output Display
        System.out.println("\n================ Results ================");
        System.out.printf("Principal Amount        : %.2f\n", principal);
        System.out.println("-----------------------------------------");
        System.out.printf("Simple Interest (SI)    : %.2f\n", si);
        System.out.printf("Total Amount (with SI)  : %.2f\n", totalAmountSI);
        System.out.println("-----------------------------------------");
        System.out.printf("Compound Interest (CI)  : %.2f (%s)\n", ci, frequencyText);
        System.out.printf("Total Amount (with CI)  : %.2f\n", totalAmountCI);
        System.out.println("=========================================");
        
        scanner.close();
    }
}

