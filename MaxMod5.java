/*Given two int values, return whichever value is larger. However if the two values have the same remainder 
when divided by 5, then the return the smaller value. However, in all cases, if the two values are the same, return 0. 



maxMod5(2, 3) → 3
maxMod5(6, 2) → 6
maxMod5(3, 2) → 3 */

public class MaxMod5 {
    public static void main(String[] args) {
        System.out.println(maxMod5(2, 3)); // Output: 3
        System.out.println(maxMod5(6, 2)); // Output: 6
        System.out.println(maxMod5(3, 2)); // Output: 3
    }
    
    public static int maxMod5(int a, int b) {
        if (a == b)
            return 0;

        if (a % 5 == b % 5)
            return Math.min(a, b);

        return Math.max(a, b);
    }
}