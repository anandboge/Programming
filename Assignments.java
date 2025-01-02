/*Janmansh and Assignments

Janmansh has to submit 3 assignments for Chingari before 10 pm and he starts to do the assignments at X pm. Each 
assignment takes him 1 hour to complete. Can you tell whether he'll be able to complete all assignments on time or not?

Input Format

The first line will contain T - the number of test cases. Then the test cases follow.The first and only line of each 
test case contains one integer X - the time when Janmansh starts doing the assignments.

Output Format

For each test case, output Yes if he can complete the assignments on time. Otherwise, output No.

You may print each character of Yes and No in uppercase or lowercase (for example, yes, yEs, YES will be considered identical). 

Sample 1:
Input
2
7
9

Output
Yes
No*/

import java.util.Scanner;

public class Assignments {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		for (int i=1;i<=t ;i++) {
		    int x = input.nextInt();
		    int assi = 3;
		    if(x+assi<=10){
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
		    }
		}
    }
}