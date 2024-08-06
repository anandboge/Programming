/*Look for patterns like "zip" and "zap" in the string -- length-3, starting with 'z' and ending with 'p'. 
Return a string where for all such words, the middle letter is gone, so "zipXzap" yields "zpXzp".


zipZap("zipXzap") → "zpXzp"
zipZap("zopzop") → "zpzp"
zipZap("zzzopzop") → "zzzpzp" */

public class ZipZap {

    public static void main(String[] args) {
        System.out.println(zipZap("zipXzap")); //zpXzp
        System.out.println(zipZap("zopzop")); //zpzp
        System.out.println(zipZap("zzzopzop")); //zzzpzp
    }
    
    public static String zipZap(String str) {
        
    String result = "";
  
    for (int i = 0; i < str.length(); i++) {
        if (i < str.length() - 2 && str.charAt(i) == 'z' && str.charAt(i + 2) == 'p') {
            result += str.charAt(i) + "" + str.charAt(i + 2);
            i += 2;
            } else {
            result += str.charAt(i);
            }
        }
        return result;
    }
}