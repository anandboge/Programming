/*Watching Movies at 2x

Chef started watching a movie that runs for a total of X minutes.

Chef has decided to watch the first Y minutes of the movie at twice the usual speed as he was warned 
by his friends that the movie gets interesting only after the first Y minutes.

How long will Chef spend watching the movie in total?

Note: It is guaranteed that Y is even.

Input Format

The first line contains two space separated integers X,Y - as per the problem statement.

Output Format

Print in a single line, an integer denoting the total number of minutes that Chef spends in watching the movie. 

Sample 1:
Input
100 20

Output
90
*/

import java.util.Scanner;

public class WatchingMovies {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		//int t = input.nextInt();
		//for (int i=1;i<=t ;i++) {
		    int x = input.nextInt();
		    int y = input.nextInt();
		    int total = (x-y)+(y/2);
		    System.out.println(total);
    }
}