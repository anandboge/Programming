/*Credit score
To access CRED programs, one needs to have a credit score of 750 or more.
Given that the present credit score is X, determine if one can access CRED programs or not.

If it is possible to access CRED programs, output YES, otherwise output NO.

Input Format

The first and only line of input contains a single integer X, the credit score.

Output Format

Print YES if it is possible to access CRED programs. Otherwise, print NO.

You may print each character of the string in uppercase or lowercase (for example, the strings YeS, 
yEs, yes and YES will all be treated as identical). 

Sample 1:
Input
823

Output
YES*/

import java.util.Scanner;

public class CreditScore {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
		if(x>=750){
		    System.out.println("YES");
		}
		else{
		    System.out.println("NO");
		}
    }
}