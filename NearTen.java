/*Given a non-negative number "num", return true if num is within 2 of a multiple of 10. 
Note: (a % b) is the remainder of dividing a by b, so (7 % 5) is 2.

nearTen(12) → true
nearTen(17) → false
nearTen(19) → true */

public class NearTen {
    public static boolean nearTen(int num) {
        return (num % 10) <= 2 || (num % 10) >= 8;
    }
    public static void main(String[] args) {
        System.out.println(nearTen(12));
        System.out.println(nearTen(17));
        System.out.println(nearTen(19));
    }
}