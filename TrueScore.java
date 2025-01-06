/*Is the Score Consistent
Chef is watching a football match. The current score is A:B, that is, team 1 has scored A goals and team 2 has scored 
B goals. Chef wonders if it is possible for the score to become C:D at a later point in the game (i.e. team 
1 has scored C goals and team 2 has scored D goals). Can you help Chef by answering his question?

Input Format

The first line contains a single integer T - the number of test cases. Then the test cases follow.

The first line of each test case contains two integers A and B - the intial number of goals team 1 and team 
2 have scored respectively.

The second line of each test case contains two integers C and D - the final number of goals team 1 and team 
2 must be able to score respectively.

Output Format

For each testcase, output POSSIBLE if it is possible for the score to become C:D at a later point in the game, IMPOSSIBLE otherwise.

You may print each character of POSSIBLE and IMPOSSIBLE in uppercase or lowercase 
(for example, possible, pOSsiBLe, Possible will be considered identical). 

Sample 1:
Input
3
1 5
3 5
3 4
2 6
2 2
2 2

Output
POSSIBLE
IMPOSSIBLE
POSSIBLE*/

import java.util.Scanner;

public class TrueScore {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		for (int i=1;i<=t ;i++) {
		    int a = input.nextInt();
		    int b = input.nextInt();
		    int c = input.nextInt();
		    int d = input.nextInt();
		    if(c>=a && d>=b){
		        System.out.println("POSSIBLE");
		    }
		    else{
		        System.out.println("IMPOSSIBLE");
		    }
		}
    }
}