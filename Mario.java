/*Mario and Transformation

Mario transforms each time he eats a mushroom as follows:

If he is currently small, he turns normal.
If he is currently normal, he turns huge.
If he is currently huge, he turns small.
Given that Mario was initially normal, find his size after eating X mushrooms.

Input Format

The first line of input will contain one integer T, the number of test cases. Then the test cases follow.
Each test case contains a single line of input, containing one integer X.

Output Format

For each test case, output in a single line Mario's size after eating X mushrooms.

Print:

NORMAL, if his final size is normal.
HUGE, if his final size is huge.
SMALL, if his final size is small.
You may print each character of the answer in either uppercase or lowercase (for example, the strings Huge, hUgE, 
huge and HUGE will all be treated as identical). 

Sample 1:

Input
3
2
4
12

Output
SMALL
HUGE
NORMAL*/

import java.util.Scanner;

public class Mario {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the number of test cases
        int T = sc.nextInt();
        
        // Process each test case
        for (int i = 0; i < T; i++) {
            // Read the number of mushrooms Mario eats
            int X = sc.nextInt();
            
            // Determine Mario's size after eating X mushrooms
            int state = X % 3;
            
            // Output the corresponding size
            if (state == 0) {
                System.out.println("NORMAL");
            } else if (state == 1) {
                System.out.println("HUGE");
            } else {
                System.out.println("SMALL");
            }
        }
    }
}