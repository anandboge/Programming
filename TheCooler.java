/*The Cooler Dilemma 1

Summer is at its peak in Chefland. Chef is planning to purchase a water cooler to keep his room cool. He has two options available:

Rent a cooler at the cost of X coins per month.
Purchase a cooler for Y coins.

Given that the summer season will last for M months in Chefland, help Chef in finding whether he should rent the 
cooler or not.

Chef rents the cooler only if the cost of renting the cooler is strictly less than the cost of purchasing it. Otherwise, he purchases the cooler.

Print YES if Chef should rent the cooler, otherwise print NO.

Input Format

The first line of input will contain an integer T — the number of test cases. The description of T test cases follows.
The first and only line of each test case contains three integers X, Y and M, as described in the problem statement.

Output Format

For each test case, output YES if Chef should rent the cooler, otherwise output NO.

You may print each character of the string in uppercase or lowercase (for example, the strings YeS, yEs, yes and 
YES will all be treated as identical). 

Sample 1:
Input
3
5 10 1
5 10 2
5 10 3

Output
YES
NO
NO*/

import java.util.Scanner;

public class TheCooler {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		for (int i=1;i<=t ;i++) {
		    int x = input.nextInt();
		    int y = input.nextInt();
		    int m = input.nextInt();
		    int a = x*m;
		    if(a<y){
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
		    }
		}
    }
}