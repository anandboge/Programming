/*Six Friends
Six friends go on a trip and are looking for accommodation. After looking for hours, they find a hotel which offers 
two types of rooms — double rooms and triple rooms. A double room costs Rs. X, while a triple room costs Rs. Y.

The friends can either get three double rooms or get two triple rooms. Find the minimum amount they will have to 
pay to accommodate all six of them.

Input Format

The first line contains a single integer T - the number of test cases. Then the test cases follow.
The first and only line of each test case contains two integers X and Y - the cost of a double room and the cost of a triple room.

Output Format

For each testcase, output the minimum amount required to accommodate all the six friends. 

Sample 1:
Input
3
10 15
6 8
4 8

Output
30
16
12*/

import java.util.Scanner;

public class SixFriends {

    public static void main(String[] args) {
        	Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		for (int i=1;i<=t ;i++) {
		    int x = input.nextInt();
		    int y = input.nextInt();
		    int z = Math.min(3*x,2*y);
		    System.out.println(z);
		}
    }
}