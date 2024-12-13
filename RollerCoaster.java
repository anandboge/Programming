/*Roller Coaster

Chef's son wants to go on a roller coaster ride. The height of Chef's son is X inches while the minimum 
height required to go on the ride is H inches. Determine whether he can go on the ride or not.

Input Format

The first line contains a single integer T - the number of test cases. Then the test cases follow.

The first and only line of each test case contains two integers X and H - the height of Chef's son and the 
minimum height required for the ride respectively.

Output Format

For each test case, output in a single line, YES if Chef's son can go on the ride. Otherwise, output NO.

You may print each character of YES and NO in uppercase or lowercase 
(for example, yes, yEs, Yes will be considered identical) 

Sample 1:
Input
4
15 20
50 48
32 32
38 39

Output
NO
YES
YES
NO*/

import java.util.Scanner;

public class RollerCoaster {

    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		for (int i=1;i<=t ;i++) {
		    int x = input.nextInt();
		    int h = input.nextInt();
		    if(x>=h){
		    System.out.println("Yes");
		    }
		    else{
		        System.out.println("No");
		    }
		}
    }
}