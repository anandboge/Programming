/*Valentine is Coming

Valentine's Day is approaching and thus Chef wants to buy some chocolates for someone special.

Chef has a total of X rupees and one chocolate costs Y rupees. What is the maximum number of chocolates Chef can buy?

Input Format

First line will contain T, the number of test cases. Then the test cases follow.
Each test case contains a single line of input, two integers X,Y - the amount Chef has and the cost of one chocolate respectively.

Output Format

For each test case, output the maximum number of chocolates Chef can buy. 

Sample 1:

Input
4
5 10
16 5
35 7
100 1

Output
0
3
5
100*/

import java.util.Scanner;

public class IsComing {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		for (int i=1;i<=t ;i++) {
		    int x = input.nextInt();
		    int y = input.nextInt();
		    int maxi = x/y;
		    System.out.println(maxi);
		}
    }
}