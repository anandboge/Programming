/*Get Subscription

Chef wants to conduct a lecture for which he needs to set up an online meeting of exactly X minutes.

The meeting platform supports a meeting of maximum 30 minutes without subscription and a meeting of unlimited duration with subscription.

Determine whether Chef needs to take a subscription or not for setting up the meet.

Input Format

First line will contain T, the number of test cases. Then the test cases follow.
Each test case contains a single integer X - denoting the duration of the lecture.

Output Format

For each test case, print in a single line, YES if Chef needs to take the subscription, otherwise print NO.

You may print each character of the string in uppercase or lowercase (for example, the strings YES, yEs, yes, 
and yeS will all be treated as identical). 

Sample 1:
Input
4
50
3
30
80

Output
YES
NO
NO
YES*/

import java.util.Scanner;

public class Getsubscription {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		for (int i=1;i<=t ;i++) {
		    int x = input.nextInt();
		    if (x<=30){
		        System.out.println("No");
		    }
		    else if(x>30){
		        System.out.println("Yes");
		    }
		}
    }
}