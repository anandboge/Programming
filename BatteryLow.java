/*Battery Low

Chef's phone shows a Battery Low notification if the battery level is 15% or less.

Given that the battery level of Chef's phone is X%, determine whether it would show a Battery low notification.

Input Format

First line will contain T, number of test cases. Then the test cases follow.
Each test case contains a single line of input, an integer X, denoting the battery level of the phone.

Output Format

For each test case, output in a single line Yes, if the battery level is 15% or below. Otherwise, print No.

You may print each character of Yes and No in uppercase or lowercase (for example, 
YeS, YES, yes will be considered identical). 

Sample 1:
Input
3
15
3
65

Output
Yes
Yes
No*/

import java.util.Scanner;

public class BatteryLow {

    public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		for (int i = 1;i<=t ;i++ ){ 
		    int x = input.nextInt();
		    if(x<=15){
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
		    }
		}
    }
}
