/*Number Mirror

Write a program that takes a number N as the input, and prints it to the output.

Input Format

The only line of input contains a single integer.

Output Format

Output the answer in a single line. 

Sample 1:
Input
123

Output
123*/

import java.util.Scanner;

public class NumberMirror {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		System.out.println(n);
    }
}