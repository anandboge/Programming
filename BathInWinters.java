/*Bath in Winters

A geyser has a capacity of X litres of water and a bucket has a capacity of Y litres of water.

One person requires exactly 2 buckets of water to take a bath. Find the maximum number of people 
that can take bath using water from one completely filled geyser..

Input Format

First line will contain T, number of test cases. Then the test cases follow.
Each test case contains a single line of input, two integers X,Y.

Output Format

For each test case, output the maximum number of people that can take bath. 

Sample 1:
Input
4
10 6
25 1
100 10
30 40

Output
0
12
5
0*/

import java.util.Scanner;

public class BathInWinters {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		for (int i=1;i<=t ;i++) {
		    int x = input.nextInt();
		    int y = input.nextInt();
		    int person = 2*y;
		    int geyser = x/person;
		    System.out.println(geyser);
		}
    }
}