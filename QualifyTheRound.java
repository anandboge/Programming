/*Qualify the round

In a coding contest, there are two types of problems:

Easy problems, which are worth 1 point each 
Hard problems, which are worth 2 points each

To qualify for the next round, a contestant must score at least X points. Chef solved A Easy 
problems and B Hard problems. Will Chef qualify or not?

Input Format

The first line of input contains a single integer T, denoting the number of test cases. The description of 
T test cases follows.
Each test case consists of a single line of input containing three space-separated integers — X,A, and B.

Output Format

For each test case, output a new line containing the answer — Qualify if Chef qualifies for the next round, and NotQualify otherwise.

Each character of the answer may be printed in either uppercase or lowercase. For example, if the answer is Qualify, 
outputs such as qualify, quALiFy, QUALIFY and QuAlIfY will also be accepted as correct. 

Sample 1:
Input

3
15 9 3
5 3 0
6 2 8

Output

Qualify
NotQualify
Qualify
*/

import java.util.Scanner;

public class QualifyTheRound {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		for (int i=1;i<=t ;i++) {
		    int x = input.nextInt();
		    int a = input.nextInt();
		    int b = input.nextInt();
		    int x1=(a*1)+(b*2);
		    if(x1>=x){ 
		        System.out.println("Qualify");
		    }
		    else{
		        System.out.println("NotQualify");
		    }
		}
    }
}