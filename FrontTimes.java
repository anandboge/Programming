/*Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars, 
or whatever is there if the string is less than length 3. Return n copies of the front;

frontTimes("Chocolate", 2) → "ChoCho"
frontTimes("Chocolate", 3) → "ChoChoCho"
frontTimes("Abc", 3) → "AbcAbcAbc" */

import java.util.Scanner;

public class FrontTimes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String string = input.nextLine();
        System.out.print("Enter the first number: ");
        int m = input.nextInt();
        System.out.println(frontTimes(string, m));
    }
    public static String frontTimes(String str, int n) {
  
        String str1 = "";
        
        if(str.length() < 3){
          for (int i = 0; i < n; i++){
            str1 += str;
          }
          return str1;
        }
        
        
        String sub = str.substring(0,3);  
        if (str.length() >= 3){
          for (int i =0; i < n; i++){
            str1 = str1 + sub;
          }
        }
        return str1;
    }
}
