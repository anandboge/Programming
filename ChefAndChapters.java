/*Chef and Chapters
This semester, Chef took X courses. Each course has Y units and each unit has Z chapters in it.
Find the total number of chapters Chef has to study this semester.

Input Format
The first line will contain T, the number of test cases. Then the test cases follow.
Each test case consists of a single line of input, containing three space-separated integers X,Y, and Z. */

import java.util.Scanner;

public class ChefAndChapters {

    public static void main(String[] args) {
        // Create a scanner to read input
        Scanner sc = new Scanner(System.in);
        
        // Read the number of test cases
        int T = sc.nextInt();
        
        // Loop through each test case
        for (int t = 0; t < T; t++) {
            // Read the values of X, Y, Z for the current test case
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int Z = sc.nextInt();
            
            // Calculate the total number of chapters
            int totalChapters = X * Y * Z;
            
            // Output the result for the current test case
            System.out.println(totalChapters);
        }
        
        // Close the scanner
        sc.close();
    }
}
