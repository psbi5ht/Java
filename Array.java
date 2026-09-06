import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Take array size input from the user
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        // Initialize the array
        int[] numbers = new int[size];

        // 2. Insert elements into the array via user input
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Print the original unsorted array
        System.out.println("\nOriginal Array: " + Arrays.toString(numbers));

        // 3. Sort the array
        Arrays.sort(numbers);
        System.out.println("Sorted Array: " + Arrays.toString(numbers));

        // 4. Search for an element in the sorted array
        System.out.print("\nEnter the element you want to search for: ");
        int target = scanner.nextInt();

        // Arrays.binarySearch() efficiently finds the index of the element
        int index = Arrays.binarySearch(numbers, target);

        // 5. Display the search results
        if (index >= 0) {
            System.out.println("Element " + target + " found at index (0-based): " + index);
        } else {
            System.out.println("Element " + target + " was not found in the array.");
        }

        scanner.close();
    }
}
