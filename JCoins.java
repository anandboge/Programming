/*Janmansh and Coins
Janmansh received X coins of 10 rupees and Y coins of 5 rupees from Chingari. Since he is weak in math, 
can you find out how much total money does he have?

Input Format
The first line will contain T - the number of test cases. Then the test cases follow.The first and only line 
of each test case contains two integers X, Y - the number of 10 and 5 rupee coins respectively.

Output Format

For each test case, output how much total money does Janmansh have.


Sample 1:
Input
2
2 1
3 4

Output
25
50 */

import java.util.Scanner;

public class JCoins {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		for (int i = 1;i<=t ;i++ ){
		    int x = input.nextInt();
		    int y = input.nextInt();
		    int total = (x*10)+(y*5);
		    System.out.println(total);
		}
    }
}