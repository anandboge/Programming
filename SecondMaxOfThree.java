/*Second Max of Three Numbers

Problem Statement
Write a program that accepts sets of three numbers, and prints the second-maximum number among the three.

Input

First line contains the number of triples, N.
The next N lines which follow each have three space separated integers.

Output

For each of the N triples, output one new line which contains the second-maximum integer among the three.

Sample 1:
Input
3
1 2 3
10 15 5
100 999 500

Output
2
10
500*/

import java.util.Scanner;

public class SecondMaxOfThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Number of triples
        int N = scanner.nextInt();
        
        // Process each triple
        for (int i = 0; i < N; i++) {
            // Read three integers
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            
            // Find the second maximum of the three numbers
            int secondMax = findSecondMax(a, b, c);
            
            // Output the result
            System.out.println(secondMax);
        }
    }
    
    // Method to find the second maximum of three numbers
    public static int findSecondMax(int a, int b, int c) {
        // Use simple comparisons to find the second maximum
        if ((a >= b && a <= c) || (a <= b && a >= c)) {
            return a;
        } else if ((b >= a && b <= c) || (b <= a && b >= c)) {
            return b;
        } else {
            return c;
        }
    }
}