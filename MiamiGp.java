/*Miami GP
Chef has finally got the chance of his lifetime to drive in the F1 tournament. But, there is one problem. 
Chef did not know about the 107% rule and now he is worried whether he will be allowed to race in the main event or not.

Given the fastest finish time as X seconds and Chef's finish time as 
Y seconds, determine whether Chef will be allowed to race in the main event or not.

Note that, Chef will only be allowed to race if his finish time is within 107% of the fastest finish time.

Input Format

First line will contain T, number of testcases. Then the testcases follow. Each testcase contains of a single 
line of input, two space separated integers X and Y denoting the fastest finish time and Chef's finish time respectively.

Output Format

For each test case, output YES if Chef will be allowed to race in the main event, else output NO.

You may print each character of the string in uppercase or lowercase (for example, the strings YeS, 
yEs, yes and YES will all be treated as identical). 

Sample 1:
Input
4
1 2
15 16
15 17
100 107

Output
NO
YES
NO
YES
*/

import java.util.Scanner;

public class MiamiGp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		for (int i=1;i<=t ;i++) {
		    int x = input.nextInt();
		    int y = input.nextInt();
		    double finish = x*1.07;
		    if(y<=finish){
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
		    }
		}
    }
}