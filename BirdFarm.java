/*Chef and Bird farm
In Chefland, each chicken has 
X
X legs and each duck has 
Y
Y legs. Chef's farm can have exactly one type of bird.

Given that the birds on the farm have a total of 
Z
Z legs:

Print CHICKEN, if the farm can have only chickens but not ducks.
Print DUCK, if the farm can have only ducks but not chickens.
Print ANY, if the farm can have either chickens or ducks.
Print NONE, if the farm can have neither chickens nor ducks.
Input Format
The first line will contain 
T
T, the number of test cases. Then the test cases follow.
Each test case consists of a single line of input, containing three space-separated integers 
X
,
Y
,
Z
X,Y,Z.
Output Format
For each test case, output in a single line the type of bird on the farm.

Print CHICKEN, if the farm can have only chickens but not ducks.
Print DUCK, if the farm can have only ducks but not chickens.
Print ANY, if the farm can have either chickens or ducks.
Print NONE, if the farm can have neither chickens nor ducks.
You may print each character of the string in uppercase or lowercase (for example, the strings 
AnY
AnY, 
anY
anY, 
any
any and 
ANY
ANY will all be treated as identical).

Sample 1:
Input
3
2 3 5
2 2 2
3 4 6

Output
NONE
ANY
CHICKEN*/

import java.util.Scanner;

public class BirdFarm {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		for (int i=1;i<=t ;i++) {
		    int x = input.nextInt();
		    int y = input.nextInt();
		    int z = input.nextInt();
		    if(z%x==0 && z%y!=0){
		        System.out.println("CHICKEN");
		    }
		    else if(z%y==0 && z%x!=0){
		        System.out.println("DUCK");
		    }
		    else if(z%x==0 && z%y==0){
		        System.out.println("ANY");
		    }
		    else{
		        System.out.println("NONE");
		    }
		}
    }
}