/*Given a string, does "xyz" appear in the middle of the string? To define middle, we'll say that the number of 
chars to the left and right of the "xyz" must differ by at most one. This problem is harder than it looks.


xyzMiddle("AAxyzBB") → true
xyzMiddle("AxyzBB") → true
xyzMiddle("AxyzBBB") → false */

public class XyzMiddle {

    public static void main(String[] args) {
        System.out.println(xyzMiddle("AAxyzBB")); // true
        System.out.println(xyzMiddle("AxyzBB")); // true
        System.out.println(xyzMiddle("AxyzBBB")); // false
    }
    public static boolean xyzMiddle(String s) {
        int n = s.length();
        String xyz = "xyz";
        int lenXyz = xyz.length();

        for (int i = 0; i <= n - lenXyz; i++) {
            if (s.substring(i, i + lenXyz).equals(xyz)) {
                int leftLen = i;
                int rightLen = n - (i + lenXyz);
                if (Math.abs(leftLen - rightLen) <= 1) {
                    return true;
                }
            }
        }

        return false;
    }
}