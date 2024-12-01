/*Good Program

In computing, the collection of four bits is called a nibble.

Chef defines a program as:
Good, if it takes exactly X nibbles of memory, where X is a positive integer.
Not Good, otherwise.Given a program which takes N bits of memory, determine whether it is Good or Not Good.

Input Format

First line will contain T, number of test cases. Then the test cases follow.
The first and only line of each test case contains a single integer N, the number of bits taken by the program.

Output Format

For each test case, output Good or Not Good in a single line. You may print each character of Good or NotGood
in uppercase or lowercase (for example, GoOd, GOOD, good will be considered identical). 

Sample 1:
Input

4
8
17
52
3

Output

Good
Not Good
Good
Not Good
*/

import java.util.Scanner;

public class GoodProgram {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		for (int i = 1;i<=t ;i++ ){
		    int x = input.nextInt();
		    if(x%4==0 && x>0){
		        System.out.println("Good");
		    }
		    else{
		        System.out.println("Not Good");
		    }
		}
    }
}