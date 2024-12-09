/*Finding Shoes

Chef has N friends. Chef promised that he would gift a pair of shoes (consisting of one left shoe and one right shoe) 
to each of his N friends. Chef was about to go to the marketplace to buy shoes, but he suddenly remembers that he 
already had M left shoes.

What is the minimum number of extra shoes that Chef will have to buy to ensure that he is able to gift a pair of 
shoes to each of his N friends?

For example, if N=2, M=4, then Chef already has 4 left shoes, so he must buy 2 extra right shoes to form 2 pairs of shoes.

Therefore Chef must buy at least 2 extra shoes to ensure that he is able to get N=2 pairs of shoes.

Input Format

The first line contains a single integer T - the number of test cases. Then the test cases follow.
The first line of each test case contains two integers N and M - the number of Chef's friends and the number 
of left shoes Chef has.

Output Format
For each test case, output the minimum number of extra shoes that Chef will have to buy to ensure that he is 
able to get N pairs of shoes. 

Sample 1:
Input
3
2 4
6 0
4 3

Output
2
12
5*/

import java.util.Scanner;

public class FindingShoes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    	int T = scanner.nextInt();
        
        for (int t = 0; t < T; t++) {
            // Read values of N and M
            int N = scanner.nextInt();
            int M = scanner.nextInt();
            
            // Calculate the number of extra shoes needed
            int leftShoesNeeded = Math.max(0, N - M);
            int rightShoesNeeded = N;
            
            // Total extra shoes to be bought
            int extraShoes = leftShoesNeeded + rightShoesNeeded;
            
            // Output the result for this test case
            System.out.println(extraShoes);
        }
    }
}