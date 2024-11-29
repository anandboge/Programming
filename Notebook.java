/*Count the Notebooks
You know that 1 kg of pulp can be used to make 1000 pages and 1 notebook consists of 100 pages.

Suppose a notebook factory receives N kg of pulp, how many notebooks can be made from that?

Input Format

First line will contain T, the number of test cases. Then the test cases follow.
Each test case contains a single integer N - the weight of the pulp the factory has (in kgs).

Output Format

For each test case, output the number of notebooks that can be made using N kgs of pulp.


Sample 1:
Input

3
1
100
50

Output

10
1000
500 */

import java.util.Scanner;

public class Notebook {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		for (int i = 1;i<=t ;i++ ){
		    int n = input.nextInt();
		    int total = n*10;
		    System.out.println(total);
		} 
    }
}