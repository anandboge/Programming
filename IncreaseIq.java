/*Increase IQ
A study has shown that playing a musical instrument helps in increasing one's IQ by 7 points. Chef knows he can't 
beat Einstein in physics, but he wants to try to beat him in an IQ competition.

You know that Einstein had an IQ of 170, and Chef currently has an IQ of X.

Determine if, after learning to play a musical instrument, Chef's IQ will become strictly greater than Einstein's.

Print "Yes" if it is possible for Chef to beat Einstein, else print "No" (without quotes).

You may print each character of the string in either uppercase or lowercase 
(for example, the strings yEs, yes, Yes, and YES will all be treated as identical).

Input Format

The first and only line of input will contain a single integer X, the current IQ of Chef.

Output Format

For each testcase, output in a single line "Yes" or "No"
You may print each character of the string in either uppercase or lowercase 
(for example, the strings yEs, yes, Yes, and YES will all be treated as identical). 

Sample 1:
Input
165

Output
Yes*/

import java.util.Scanner;

public class IncreaseIq {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		int y = x+7;
		if(y>170){
		    System.out.println("YES");
		}
		else{
		    System.out.println("NO");
		}
    }
}