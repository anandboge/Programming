/*Lunchtime

Chef has his lunch only between 1 pm and 4 pm (both inclusive).

Given that the current time is X pm, find out whether it is lunchtime for Chef.

Input Format

The first line of input will contain a single integer T, the number of test cases. Then the test cases follow.
Each test case contains a single line of input, containing one integer X.

Output Format

For each test case, print in a single line YES if it is lunchtime for Chef. Otherwise, print NO.
You may print each character of the string in either uppercase or lowercase 
(for example, the strings YeS,yEs, yes and YES will all be treated as identical). 

Sample 1:
Input
3
1
7
3

Output
YES
NO
YES*/

import java.util.Scanner;

public class LunchTime {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
		
		int t = s.nextInt();
		for(int i = 1; i <= t; i++){
		    int x = s.nextInt();
		    if(x>=1 && x<=4){
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
		    }
		}
    }
}