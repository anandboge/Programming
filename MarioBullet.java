/*Mario and Bullet
Mario's bullet moves at 
X pixels per frame. He wishes to shoot a goomba standing 
Y pixels away from him. The goomba does not move.

Find the minimum time (in seconds) after which Mario should shoot the bullet, such that it hits the goomba after at least 
Z seconds from now.

Input Format
The first line of input will contain an integer 

T, the number of test cases. Then the test cases follow.
Each test case consists of a single line of input, containing three space-separated integers 
X,Y, and Z.
Output Format
For each test case, output in a single line the minimum time (in seconds) after which Mario should shoot the bullet, such that it hits the goomba after at least 
Z seconds from now. 

Sample 1:
Input

3
3 3 5
2 4 1
3 12 8

Output
4
0
4*/

import java.util.Scanner;

public class MarioBullet {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
		int t = read.nextInt();
		for(int i=0; i<t; i++){
		    int x = read.nextInt();
		    int y = read.nextInt();
		    int z = read.nextInt();
		    if((z-(y/x))>=0){
		        System.out.println(z-(y/x));
		    }
		    else{
		        System.out.println(0);
		    }
		}
    }
}