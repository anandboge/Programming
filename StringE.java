/*Return true if the given string contains between 1 and 3 'e' chars.

stringE("Hello") → true
stringE("Heelle") → true
stringE("Heelele") → false */

import java.util.Scanner;

public class StringE {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str1 = input.nextLine();
        System.out.println(stringE(str1));
    }
    public static boolean stringE(String str) {
        int result = 0;
        
        for (int i = 0; i < str.length(); i++){
          if(str.substring(i, i+1).equals("e")){
            result++;
          }
        }
        return (result>=1 && result<=3);
    }
}
