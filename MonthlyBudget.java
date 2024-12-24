/*Monthly Budget

Akshat has X rupees to spend in the current month. His daily expenditure is Y rupees, i.e., he spends 
Y rupees each day.

Given that the current month has 30 days, find out if Akshat has enough money to meet his daily expenditures 
for this month.

Input Format

The first line will contain T - the number of test cases. Then the test cases follow.
The first and only line of each test case contains two integers X, 
Y - the amount of money Akshat has for the current month and his daily expenditure respectively.

Output Format

For each test case, output YES if Akshat has enough money to meet his daily expenditure for 
30 days of the month, otherwise output NO.

You may print each character of YES and NO in uppercase or lowercase (for example, yes, yEs, 
Yes will be considered identical). 

Sample 1:
Input
3
1000 10
250 50
1500 50

Output
YES
NO
YES*/

import java.util.Scanner;

public class MonthlyBudget {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		for (int i=1;i<=t ;i++) {
		    int x = input.nextInt();
		    int y = input.nextInt();
		    int month = 30*y;
		    if(month<=x){
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
		    }
		}
    }
}