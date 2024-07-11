/*We want to make a row of bricks that is goal inches long. We have a number of small bricks (1 inch each) 
and big bricks (5 inches each). Return true if it is possible to make the goal by choosing from the given bricks. 
This is a little harder than it looks and can be done without any loops.


makeBricks(3, 1, 8) → true
makeBricks(3, 1, 9) → false
makeBricks(3, 2, 10) → true */

public class MakeBricks {

    public static void main(String[] args) {
        System.out.println(makeBricks(3, 1, 8)); // true
        System.out.println(makeBricks(3, 1, 9)); // false
        System.out.println(makeBricks(3, 2, 10)); // true
    }
    
    public static boolean makeBricks(int small, int big, int goal) {
        // Calculate the number of small bricks that can be used
        int smallBricks = Math.min(goal / 5, big);
        // Calculate the remaining goal after using small bricks
        goal -= smallBricks * 5;
        // If the remaining goal is less than or equal to the number of small bricks, it is possible to make the goal
        return goal <= small;
    }
}