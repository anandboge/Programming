/*Water Requirement
Finally, after purchasing a water cooler during the April long challenge, Chef noticed that his water cooler requires 
2 liters of water to cool for one hour.

How much water (in liters) would be required by the cooler to cool for N hours?

Input Format
The first line of input will contain an integer T — the number of test cases. The description of T test cases follows.
The first and only line of each test case contains an integer N, as described in the problem statement.

Output Format
For each test case, output the number of liters of water required by the water cooler to cool for N hours.


Sample 1:
Input
2
1
2

Output
2
4 */

import java.util.Scanner;

public class WaterRequirement {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Read the number of test cases
        int T = scanner.nextInt();

        // Loop through each test case
        for (int i = 0; i < T; i++) {
            // Read the number of hours N for the current test case
            int N = scanner.nextInt();

            // Calculate the water required (2 liters per hour)
            int waterRequired = 2 * N;

            // Output the result for the current test case
            System.out.println(waterRequired);
        }

        // Close the scanner object to prevent memory leaks
        scanner.close();
    }
}
