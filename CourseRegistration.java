/*Course Registration

There is a group of N friends who wish to enroll in a course together. The course has a maximum capacity of 
M students that can register for it. If there are K other students who have already enrolled in the course, 
determine if it will still be possible for all the N friends to do so or not.

Input Format

The first line contains a single integer T - the number of test cases. Then the test cases follow.
Each test case consists of a single line containing three integers N, M and K - the size of the friend group, 
the capacity of the course and the number of students already registered for the course.

Output Format

For each test case, output Yes if it will be possible for all the N friends to register for the course. Otherwise output No.

You may print each character of Yes and No in uppercase or lowercase (for example, yes, yEs, YES will be considered identical). 

Sample 1:
Input
3
2 50 27
5 40 38
100 100 0

Output
Yes
No
Yes*/

import java.util.Scanner;

public class CourseRegistration {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		for (int i=1;i<=t ;i++) {
		    int n = input.nextInt();
		    int m = input.nextInt();
		    int k = input.nextInt();
		    if(n<=m-k){
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
		    }
		}
    }
}