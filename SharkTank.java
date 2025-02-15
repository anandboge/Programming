/*Sasta Shark Tank
Devendra just had a million-dollar idea and he needs funds to startup. He was recently invited to Sasta Shark Tank 
(A TV show where entrepreneurs pitch their ideas to investors hoping to get investment in return).

He was offered deals from two investors. The first investor offers A dollars for 10% of his company and the second 
investor offers B dollars for 20% of his company. Devendra will accept the offer from the investor whose valuation 
of the company is more. Determine which offer will Devendra accept or if both the offers are equally good.

For example, if the first investor offers 300 dollars for 10% of the company, then the first investor's valuation 
of the company is 3000 dollars since 10% of 3000=300. If the second investor offers 500 dollars for 20% of the company, 
then the second investor's valuation of the company is 2500 dollars since 20% of 2500=500.

Input Format

The first line contains a single integer T - the number of test cases. Then the test cases follow.
The first and only line of each test case contains two integers A and B - the amount offered by first investor for 
10% of Devendra's company and the amount offered by second investor for 20% of Devendra's company respectively.

Output Format

For each test case, Output FIRST if Devendra should accept the first investor's deal, output SECOND if he should accept 
the second investor's deal, otherwise output ANY if both deals are equally good.

You may print each character of the strings in uppercase or lowercase (for example, the strings "FiRst", "First", 
"FIRST", and "FIrst" will all be treated as identical). 

Sample 1:
Input

3
100 200
200 100
200 500

Output

ANY
FIRST
SECOND
*/

import java.util.Scanner;

public class SharkTank {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		for (int i=1;i<=t ;i++) {
		    int a = input.nextInt();
		    int b = input.nextInt();
		    int ia = (a*100)/10;
		    int ib = (b*100)/20;
		    if(ia>ib){
		        System.out.println("First");
		    }
		    else if(ib>ia){
		        System.out.println("Second");
		    }
		    else{
		        System.out.println("Any");
		    }
        }
    }
}