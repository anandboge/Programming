/*Given a string, compute a new string by moving the first char to come after the next two chars, 
so "abc" yields "bca". Repeat this process for each subsequent group of 3 chars, so "abcdef" yields "bcaefd". 
Ignore any group of fewer than 3 chars at the end.


oneTwo("abc") → "bca"
oneTwo("tca") → "cat"
oneTwo("tcagdo") → "catdog" */

public class OneTwo {

    public static void main(String[] args) {
        System.out.println(oneTwo("abc")); // bca
        System.out.println(oneTwo("tca")); // cat
        System.out.println(oneTwo("tcagdo")); // catdog
    }
    
    public static String oneTwo(String str) {
        String result = "";
  
        for (int i = 0; i < str.length() - 2; i += 3) {
           char firstChar = str.charAt(i);
           char secondChar = str.charAt(i + 1);
           char thirdChar = str.charAt(i + 2);
             
           result += secondChar + "" + thirdChar + "" +  firstChar;
         }
         return result;
        }
}