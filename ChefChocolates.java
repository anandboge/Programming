/*Chef and Chocolates
Chef wants to gift C chocolates to Botswal on his birthday. However, he has only X chocolates with him.
The cost of 1 chocolate is Y rupees.

Find the minimum money in rupees Chef needs to spend so that he can gift C chocolates to Botswal.

Input Format

First line will contain T, number of test cases. Then the test cases follow.
Each test case contains of a single line of input, three integers C,X, and Y.

Output Format

For each test case, output in a single line answer, the minimum money in rupees Chef needs to spend.

Sample 1:
Input
2
7 5 5
10 1 1

Output
10
9 */

import java.util.Scanner;

public class ChefChocolates {

    public static void main(String[] args) {
        	Scanner input = new Scanner(System.in) ;
		int t = input.nextInt();
		for (int i = 1;i<=t ;i++ ) {
		    int c = input.nextInt();
		    int x = input.nextInt();
		    int y = input.nextInt();
		    int minimum = (c-x)*y;
		    System.out.println(minimum);
		}
    }
}