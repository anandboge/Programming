/*Given a non-empty string and an int N, return the string made starting with char 0, 
and then every Nth char of the string. So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more.

everyNth("Miracle", 2) → "Mrce"
everyNth("abcdefg", 2) → "aceg"
everyNth("abcdefg", 3) → "adg" */

import java.util.Scanner;

public class EveryNth {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String string = input.nextLine();
        System.out.print("Enter the first number: ");
        int m = input.nextInt();
        System.out.println(everyNth(string, m));
    }
    public static String everyNth(String str, int n) {
        String result = "";
        
        for(int i = 0; i < str.length() ; i = i + n){
          result = result + str.charAt(i);
        }
        return result;
    }
}
