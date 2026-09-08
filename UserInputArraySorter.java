import java.util.Arrays;
import java.util.Scanner;

public class UserInputArraySorter {
    public static void main(String[] args) {
        // FIXED: Changed System.summary_input to System.in
        Scanner scanner = new Scanner(System.in);

        // 1. Get the size of the array from the user
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        // 2. Get the array elements from the user
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        System.out.println("\nOriginal Array: " + Arrays.toString(array));

        // 3. Sort and print in Ascending Order
        Arrays.sort(array);
        System.out.println("Ascending Order:  " + Arrays.toString(array));

        // 4. Reverse the sorted array to get Descending Order
        int len = array.length;
        for (int i = 0; i < len / 2; i++) {
            int temp = array[i];
            array[i] = array[len - 1 - i];
            array[len - 1 - i] = temp;
        }
        System.out.println("Descending Order: " + Arrays.toString(array));

        scanner.close();
    }
}

