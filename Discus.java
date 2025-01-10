/*Discus Throw
In discus throw, a player is given 3 throws and the throw with the longest distance is regarded as their final score.

You are given the distances for all 3 throws of a player. Determine the final score of the player.

Input Format

First line will contain T, number of test cases. Then the test cases follow.
Each test case contains of a single line of input, three integers A,B, and C denoting the distances in each throw.

Output Format

For each test case, output the final score of the player. 

Sample 1:
Input
3
10 15 8
32 32 32
82 45 54

Output
15
32
82*/

import java.util.Scanner;

public class Discus {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		for (int i=1;i<=t ;i++) {
		    int a = input.nextInt();
		    int b = input.nextInt();
		    int c = input.nextInt();
		    System.out.println(Math.max(Math.max(a,b),c));
		}
    }
}