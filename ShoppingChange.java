/*Shopping Change
Chef went shopping and bought items worth X rupees (1≤X≤100). Unfortunately, Chef only has a single 100 rupees note.

Since Chef is weak at maths, can you help Chef in calculating what money he should get back after paying 100 rupees for those items?

Input Format

First line will contain T, the number of test cases. Then the test cases follow.
Each test case consists of a single line containing an integer X, the total price of items Chef purchased.

Output Format

For each test case, output in a single line the money Chef has to receive back. 

Sample 1:
Input
3
1
25
100

Output
99
75
0*/

import java.util.Scanner;

public class ShoppingChange {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		for (int i=1;i<=t ;i++) {
		    int x = input.nextInt();
		    int change = 100-x;
		        System.out.println(change);
		}
    }
}