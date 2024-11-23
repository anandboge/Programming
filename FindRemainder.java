import java.util.Scanner;

public class FindRemainder {
    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Read the number of test cases
        int T = scanner.nextInt();

        // Loop through each test case
        for (int i = 0; i < T; i++) {
            // Read integers A and B
            int A = scanner.nextInt();
            int B = scanner.nextInt();

            // Find the remainder of A divided by B
            int remainder = A % B;

            // Output the remainder
            System.out.println(remainder);
        }

        // Close the scanner object
        scanner.close();
    }
}
