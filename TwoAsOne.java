/*Given three ints, a b c, return true if it is possible to add two of the ints to get the third.


twoAsOne(1, 2, 3) → true
twoAsOne(3, 1, 2) → true
twoAsOne(3, 2, 2) → false
 */

 public class TwoAsOne {
    public static void main(String[] args) {
        System.out.println(twoAsOne(1, 2, 3)); // true
        System.out.println(twoAsOne(3, 1, 2)); // true
        System.out.println(twoAsOne(3, 2, 2)); // false
    }
    
    public static boolean twoAsOne(int a, int b, int c) {
        return (a + b == c) || (a + c == b) || (b + c == a);
    }
 }