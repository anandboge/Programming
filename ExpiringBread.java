/*Expiring Bread
Eikooc loves bread. She has N loaves of bread, all of which expire after exactly M days. She can eat upto 
K loaves of bread in a day. Can she eat all the loaves of bread before they expire?

Input Format
The first line contains a single integer T - the number of test cases. Then the test cases follow.
Each test case consists of a single line containing three integers N, M and K - the number of loaves of 
bread Eikooc has, the number of days after which all the breads will expire and the number of loaves of 
bread Eikooc can eat in a day.

Output Format
For each test case, output Yes if it will be possible for Eikooc to eat all the loaves of bread before they expire. 
Otherwise output No.

You may print each character of Yes and No in uppercase or lowercase (for example, yes, yEs, YES will be considered identical).


Sample 1:
Input

3
100 100 1
9 2 5
19 6 3

Output

Yes
Yes
No */

import java.util.Scanner;

public class ExpiringBread {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read number of test cases
        int T = sc.nextInt();
        
        // Loop over each test case
        for (int t = 0; t < T; t++) {
            // Read N, M, K for each test case
            int N = sc.nextInt();
            int M = sc.nextInt();
            int K = sc.nextInt();
            
            // Check if the number of loaves can be eaten before expiration
            if (M * K >= N) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
        
        sc.close();
    }
}
