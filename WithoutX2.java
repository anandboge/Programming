/*Given a string, if one or both of the first 2 chars is 'x', return the string without those 'x' chars, 
and otherwise return the string unchanged. This is a little harder than it looks.

withoutX2("xHi") → "Hi"
withoutX2("Hxi") → "Hi"
withoutX2("Hi") → "Hi" */

public class WithoutX2 {
    public static void main(String[] args) {
        System.out.println(withoutX2("xHi"));
        System.out.println(withoutX2("Hxi"));
        System.out.println(withoutX2("Hi"));
    }
    public static String withoutX2(String str) {
        if (str.length() < 2) {
            return str;
        }
        if (str.charAt(0) == 'x' && str.charAt(1) == 'x') {
            return str.substring(2);
        }
        if (str.charAt(0) == 'x') {
            return str.substring(1);
        }
        if (str.charAt(1) == 'x') {
            return str.substring(0, 1) + str.substring(2);
        }
        return str;
    }
}