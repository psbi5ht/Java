import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MergeArrayRemoveDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Input Array 1
        System.out.print("Enter size of Array 1: ");
        int size1 = scanner.nextInt();
        int[] array1 = new int[size1];
        System.out.println("Enter elements for Array 1:");
        for (int i = 0; i < size1; i++) {
            array1[i] = scanner.nextInt();
        }

        // 2. Input Array 2
        System.out.print("Enter size of Array 2: ");
        int size2 = scanner.nextInt();
        int[] array2 = new int[size2];
        System.out.println("Enter elements for Array 2:");
        for (int i = 0; i < size2; i++) {
            array2[i] = scanner.nextInt();
        }

        // 3. Step 1: Merge the 2 arrays (keeping all elements/duplicates)
        int[] combinedArray = new int[size1 + size2];
        
        // Copy first array elements
        for (int i = 0; i < size1; i++) {
            combinedArray[i] = array1[i];
        }
        // Copy second array elements
        for (int i = 0; i < size2; i++) {
            combinedArray[size1 + i] = array2[i];
        }

        // 4. Step 2: Remove duplicates from the merged array
        ArrayList<Integer> finalUniqueList = new ArrayList<>();
        for (int num : combinedArray) {
            if (!finalUniqueList.contains(num)) {
                finalUniqueList.add(num);
            }
        }

        // --- FIXED OUTPUT SCREEN ---
        System.out.println("\n--- STEP BY STEP OUTPUT ---");
        System.out.println("Array 1: " + Arrays.toString(array1));
        System.out.println("Array 2: " + Arrays.toString(array2));
        System.out.println("Merged Array (With Duplicates): " + Arrays.toString(combinedArray));
        System.out.println("Final Array (Duplicates Removed): " + finalUniqueList);

        scanner.close();
    }
}

