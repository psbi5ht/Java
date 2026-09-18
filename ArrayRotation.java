import java.util.Arrays;
import java.util.Scanner;

// The class name is now exactly "ArrayRotation"
public class ArrayRotation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Enter positions to rotate clockwise: ");
        int positionsToRotate = scanner.nextInt();

        System.out.println("\nOriginal Array: " + Arrays.toString(array));

        rotateClockwise(array, positionsToRotate);

        System.out.println("Rotated Array:  " + Arrays.toString(array));
        
        scanner.close();
    }

    public static void rotateClockwise(int[] nums, int k) {
        if (nums == null || nums.length <= 1) {
            return;
        }
        int n = nums.length;
        k = k % n;

        reverse(nums, 0, n - 1); 
        reverse(nums, 0, k - 1); 
        reverse(nums, k, n - 1); 
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}

