/*Given two strings, a and b, create a bigger string made of the first char of a, the first char of b, 
the second char of a, the second char of b, and so on. Any leftover chars go at the end of the result.


mixString("abc", "xyz") → "axbycz"
mixString("Hi", "There") → "HTihere"
mixString("xxxx", "There") → "xTxhxexre" */

public class MixString {

    public static void main(String[] args) {
        System.out.println(mixString("abc", "xyz")); // axbycz
        System.out.println(mixString("Hi", "There")); // HTihere
        System.out.println(mixString("xxxx", "There")); // xTxhxexre
    }
    
    public static String mixString(String a, String b) {
        int small = Math.min(a.length(), b.length());
  
        String str = "";
  
        for(int i = 0; i < small; i++){
            str += a.charAt(i) + "" + b.charAt(i);
        }
        if (a.length() > b.length()){
            str += a.substring(small);
        }
        else{
             str += b.substring(small);
        }
        return str;
    }
}