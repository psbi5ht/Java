import java.util.Arrays;
import java.util.Scanner;

public class LinearBinarySearch {

    // Linear Search - Works on any array
    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) return i;
        }
        return -1;
    }

    // Binary Search - Requires a sorted array
    public static int binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (array[mid] == target) return mid;
            else if (array[mid] < target) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Enter the array size and elements
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();
        int[] originalArray = new int[size];

        System.out.println("Enter " + size + " integers (separated by spaces or enter):");
        for (int i = 0; i < size; i++) {
            originalArray[i] = scanner.nextInt();
        }

        // 2. Select the search method
        System.out.println("\nChoose your search method:");
        System.out.println("1. Linear Search");
        System.out.println("2. Binary Search");
        System.out.print("Enter choice (1 or 2): ");
        int choice = scanner.nextInt();

        // 3. Conditional routing based on the selected method
        if (choice == 1) {
            System.out.println("\n--- Linear Search Selected ---");
            System.out.println("Current Array: " + Arrays.toString(originalArray));
            
            // Ask for search number directly
            System.out.print("Enter the number you want to search for: ");
            int target = scanner.nextInt();
            
            int result = linearSearch(originalArray, target);
            if (result != -1) {
                System.out.println("Element " + target + " found at 1-based index: " + (result + 1));
            } else {
                System.out.println("Element " + target + " not found.");
            }
        } 
        else if (choice == 2) {
            System.out.println("\n--- Binary Search Selected ---");
            
            // First, automatically sort the array
            Arrays.sort(originalArray);
            System.out.println("Array sorted for Binary Search: " + Arrays.toString(originalArray));
            
            // Then, ask for the search number
            System.out.print("Enter the number you want to search for: ");
            int target = scanner.nextInt();
            
            int result = binarySearch(originalArray, target);
            if (result != -1) {
                System.out.println("Element " + target + " found at 1-based index: " + (result + 1));
            } else {
                System.out.println("Element " + target + " not found.");
            }
        } 
        else {
            System.out.println("Invalid choice! Please restart and choose 1 or 2.");
        }

        scanner.close();
    }
}

