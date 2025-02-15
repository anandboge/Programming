/*Chef and Gym
Chef has decided to join a Gym in ChefLand and if possible, also hire a personal trainer at the gym. The monthly cost 
of the gym is X and personal training will cost him an additional Y per month. Chef's total budget per month is only Z. 
Print 1 if Chef can only join the gym, 2 if he can also have a personal trainer, and 0 if he can't even join the gym.

Note that if Chef wants to hire a personal trainer, he must join the gym — he cannot hire the trainer without 
joining the gym.

Input Format

The first line of input will contain a single integer T, denoting the number of test cases. Then the test cases follow.
Each test case consists of a single line of input containing three space-separated integers X,Y,Z.

Output Format

For each test case, output in a single line 2 if Chef can go to the gym and have a trainer, 
1 if Chef can only go to the gym, 0 if he can't even go to the gym. 

*/

import java.util.Scanner;

public class ChefAndGym {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		for (int i=1;i<=t ;i++) {
		    int x = input.nextInt();
		    int y = input.nextInt();
		    int z = input.nextInt();
		    if(x+y<=z){
		        System.out.println("2");
		    }
		    else if(x<=z){
		        System.out.println("1");
		    }
		    else{
		        System.out.println("0");
		    }
		}
    }
}