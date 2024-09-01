/*Given an array of ints, return true if there is a 1 in the array with a 2 somewhere later in the array.


has12([1, 3, 2]) → true
has12([3, 1, 2]) → true
has12([3, 1, 4, 5, 2]) → true */

public class Has12 {
    public static void main(String[] args) {
        // Test cases
        System.out.println(has12(new int[]{1, 3, 2})); // true
        System.out.println(has12(new int[]{3, 1, 2})); // true
        System.out.println(has12(new int[]{3, 1, 4, 5, 2})); // true
        System.out.println(has12(new int[]{1, 2, 3})); // true
        System.out.println(has12(new int[]{2, 1, 3})); // false
    }

    public static boolean has12(int[] array) {
        boolean found1 = false;
        for (int num : array) {
            if (num == 1) {
                found1 = true;
            } else if (num == 2 && found1) {
                return true;
            }
        }
        return false;
    }
}