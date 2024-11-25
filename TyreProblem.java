/*Tyre problem
There are N bikes and M cars on the road.
Each bike has 2 tyres.
Each car has 4 tyres.
Find the total number of tyres on the road.

Input Format

The first line will contain T - the number of test cases. Then the test cases follow.
The first and only line of each test case contains two integers N,M.

Output Format
For each test case, output in a single line, the total number of tyres on the road.


Sample 1:
Input
2
2 1
3 0

Output
8
6 */

import java.util.Scanner;

public class TyreProblem {

    public static void main(String[] args) {
        // your code goes here
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		for (int i=1;i<=t ;i++) {
		    int n = input.nextInt();
		    int m = input.nextInt();
		    int total = (n*2)+(m*4);
		        System.out.println(total);
		}
    }
}