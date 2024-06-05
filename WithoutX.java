/*Given a string, if the first or last chars are 'x', return the string without those 'x' chars, 
and otherwise return the string unchanged.


withoutX("xHix") → "Hi"
withoutX("xHi") → "Hi"
withoutX("Hxix") → "Hxi" */

public class WithoutX {
    public static void main(String[] args) {
        System.out.println(withoutX("xHix"));
        System.out.println(withoutX("xHi"));
        System.out.println(withoutX("Hxix"));
    }
    public static String withoutX(String str) {
        if (str.length() < 2) {
            return str;
        }
        if (str.charAt(0) == 'x' && str.charAt(str.length() - 1) == 'x') {
            return str.substring(1, str.length() - 1);
        } else if (str.charAt(0) == 'x') {
            return str.substring(1);
        } else if (str.charAt(str.length() - 1) == 'x') {
            return str.substring(0, str.length() - 1);
        } else {
            return str;
        }
    }
}
