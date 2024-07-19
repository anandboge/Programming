/*We want make a package of goal kilos of chocolate. We have small bars (1 kilo each) and big bars (5 kilos each). 
Return the number of small bars to use, assuming we always use big bars before small bars. Return -1 if it can't 
be done.


makeChocolate(4, 1, 9) → 4
makeChocolate(4, 1, 10) → -1
makeChocolate(4, 1, 7) → 2 */

public class MakeChocolate {

    public static void main(String[] args) {
        System.out.println(makeChocolate(4, 1, 9)); // Output: 4
        System.out.println(makeChocolate(4, 1, 10)); // Output: -1
        System.out.println(makeChocolate(4, 1, 7)); // Output: 2
    }
    
    public static int makeChocolate(int small, int big, int goal) {
        // Each big bar is 5 kilos
        int bigBarWeight = 5;
        
        // Maximum number of big bars we can use to not exceed the goal
        int maxBigBars = goal / bigBarWeight;
        
        // Use as many big bars as possible but no more than available
        int bigBarsToUse = Math.min(maxBigBars, big);
        
        // Remaining weight to be filled by small bars
        int remainingWeight = goal - (bigBarsToUse * bigBarWeight);
        
        // Check if we have enough small bars to fill the remaining weight
        if (remainingWeight <= small) {
            return remainingWeight;
        } else {
            return -1;
        }
    }
}