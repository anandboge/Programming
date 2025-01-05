/*CRED Coins
For each bill you pay using CRED, you earn X CRED coins.
At CodeChef store, each bag is worth 100 CRED coins.

Chef pays Y number of bills using CRED. Find the maximum number of bags he can get from the CodeChef store.

Input Format

First line will contain T, number of test cases. Then the test cases follow.
Each test case contains of a single line of input, two integers X and Y.

Output Format

For each test case, output in a single line - the maximum number of bags Chef can get from the CodeChef store. 

Sample 1:
Input
3
10 10
20 4
70 7

Output
1
0
4*/

import java.util.Scanner;

public class CredCoins {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		for (int i=1;i<=t ;i++) {
		    int x = input.nextInt();
		    int y = input.nextInt();
		    int coins = x*y;
		    int bags = coins/100;
		    System.out.println(bags);
		}
    }
}