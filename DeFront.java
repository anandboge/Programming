/*Given a string, return a version without the first 2 chars. Except keep the first char if it is 'a' 
and keep the second char if it is 'b'. The string may be any length. Harder than it looks.


deFront("Hello") → "llo"
deFront("java") → "va"
deFront("away") → "aay" */

public class DeFront {

    public static void main(String[] args) {
        System.out.println(deFront("Hello"));
        System.out.println(deFront("java"));
        System.out.println(deFront("away"));
    }
    public static String deFront(String str) {
        String result = "";
  if(str.length() > 0 && str.charAt(0) == 'a'){
    result += "a";
  }
  if(str.length() > 1 && str.charAt(1) == 'b'){
    result += "b";
  }
  if(str.length() > 2){
    result += str.substring(2);
  }
  return result;
    }
}