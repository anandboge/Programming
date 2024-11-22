/*Fill the Bucket
Chef has a bucket having a capacity of K liters. It is already filled with X liters of water.

Find the maximum amount of extra water in liters that Chef can fill in the bucket without overflowing.

Input Format

The first line will contain T - the number of test cases. Then the test cases follow.
The first and only line of each test case contains two space separated integers K and X - as mentioned in the problem.

Output Format
For each test case, output in a single line, the amount of extra water in liters that Chef can fill in the bucket without overflowing.

Sample 1:
Input

2
5 4
15 6

Output

1
9 */

import java.util.Scanner;

public class FillTheBucket {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		for (int i=1;i<=t ;i++ ){
		    int k = input.nextInt();
		    int x = input.nextInt();
		    int remain = k-x;
		    System.out.println(remain);
		}
    }
}
