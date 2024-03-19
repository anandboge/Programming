/*Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".

doubleX("axxbb") → true
doubleX("axaxax") → false
doubleX("xxxxx") → true */

import java.util.Scanner;

public class DoubleX {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String string = input.nextLine();
        System.out.println(doubleX(string));
    }
    public static boolean doubleX(String str) {
  
        int index = -1;
        for (int i = 0; i < str.length(); i++){
          if(str.charAt(i) == 'x'){
            index = i;
            break;
          }
        }
        
        if(index == -1 || index == str.length()-1){
          return false;
        }
        
        if(str.charAt(index + 1) == 'x'){
          return true;
        }
        else return false;
      }
}
