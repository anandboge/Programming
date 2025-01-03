/*Best Coupon
Chef is ordering food online (instead of cooking) and the bill comes out to be Rs. X. Chef can use one of the following two coupons to avail a discount.

Get 10 percent off on the bill amount

Get a flat discount of Rs. 100 on the bill amount

What is the maximum discount Chef can avail?

Input Format

The first line contains a single integer T - the number of test cases. Then the test cases follow.
The first and only line of each test case contains a single integer X - the bill amount before discount.

Output Format

For each testcase, output the maximum discount Chef can avail. 

Sample 1:
Input
3
300
1300
1000

Output
100
130
100*/

import java.util.Scanner;

public class BestCoupon {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		for (int i=1;i<=t ;i++) {
		    int n = input.nextInt();
		    int x = n*10/100;
            if(n>=1000){
                System.out.println(x);
            }
            else{
                System.out.println(100);
            }
		}
    }
}