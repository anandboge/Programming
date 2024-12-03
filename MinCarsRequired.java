/*Minimum Cars required

A single car can accommodate at most 4 people. 

N friends want to go to a restaurant for a party. Find the minimum number of cars required to accommodate all the friends.

Input Format

The first line contains a single integer T - the number of test cases. Then the test cases follow.
The first and only line of each test case contains an integer N - denoting the number of friends.

Output Format

For each test case, output the minimum number of cars required to accommodate all the friends. 

Sample 1:

Input

4
4
2
7
98

Output

1
1
2
25
*/

import java.util.Scanner;

public class MinCarsRequired {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		for (int i=1;i<=t ;i++) {
		    int n = input.nextInt();
		    if(n%4==0){
		        int cars = n/4;
		        System.out.println(cars);
		    }
		    else{
		        System.out.println((n/4)+1);
		    }
		}
    }
}