import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class Permutation {

    public static void main(String[] args) {
        // Step 1: Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string to find its permutations: ");
        String input = scanner.nextLine();
        
        System.out.println("\nAll unique permutations of \"" + input + "\":");
        
        // Step 2: Use a HashSet to track and print only unique permutations
        Set<String> uniquePermutations = new HashSet<>();
        findPermutations(input, "", uniquePermutations);
        
        // Display total number of permutations found
        System.out.println("\nTotal unique permutations: " + uniquePermutations.size());
        
        scanner.close();
    }

    /**
     * Recursive method to calculate all unique permutations of a string.
     * 
     * @param str        The remaining characters left to permute.
     * @param result     The accumulated string representing the current permutation.
     * @param resultSet  A Set to filter out duplicate permutations (e.g., if input has repeating letters).
     */
    private static void findPermutations(String str, String result, Set<String> resultSet) {
        // Base case: If the string is empty, we have completed one full permutation
        if (str.isEmpty()) {
            if (!resultSet.contains(result)) {
                resultSet.add(result);
                System.out.println(result);
            }
            return;
        }

        // Recursive case: Iterate through the remaining characters
        for (int i = 0; i < str.length(); i++) {
            // Select the character at the current index
            char ch = str.charAt(i);

            // Form a new string excluding the selected character
            String remaining = str.substring(0, i) + str.substring(i + 1);

            // Recursively call the function with the remaining string and the updated result
            findPermutations(remaining, result + ch, resultSet);
        }
    }
}

