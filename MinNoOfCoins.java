/*Minimum number of coins

Chef has infinite coins in denominations of rupees 5 and rupees 10.

Find the minimum number of coins Chef needs, to pay exactly X rupees. If it is impossible to pay X rupees in 
denominations of rupees 5 and 10 only, print −1.

Input Format

First line will contain T, number of test cases. Then the test cases follow.
Each test case contains of a single integer X.

Output Format

For each test case, print a single integer - the minimum number of coins Chef needs, to pay exactly X rupees. 
If it is impossible to pay X rupees in denominations of rupees 5 and 10 only, print −1. 

Sample 1:

Input
3
50
15
8

Output
5
2
-1
*/

import java.util.Scanner;

public class MinNoOfCoins {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		for (int i=1;i<=t ;i++) {
		    int x = input.nextInt();
		    if(x%10==0){
		        System.out.println(x/10);
		    }
		    else if(x%5==0){
		        System.out.println((x/10)+1);
		    }
		    else{
		        System.out.println(-1);
		    }
		}
    }
}