/*Given two strings, return true if either of the strings appears at the very end of the other string, 
ignoring upper/lower case differences (in other words, the computation should not be "case sensitive"). 
Note: str.toLowerCase() returns the lowercase version of a string.


endOther("Hiabc", "abc") → true
endOther("AbC", "HiaBc") → true
endOther("abc", "abXabc") → true */

public class EndOther {

    public static void main(String[] args) {
        System.out.println(endOther("Hiabc", "abc")); // true
        System.out.println(endOther("AbC", "HiaBc")); // true
        System.out.println(endOther("abc", "abXabc")); // true
    }
    
    public static boolean endOther(String str1, String str2) {
        // Convert both strings to lowercase
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        
        // Check if either string ends with the other string
        return str1.endsWith(str2) || str2.endsWith(str1);
    }
}