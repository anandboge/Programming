/*Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".

countXX("abcxx") → 1
countXX("xxx") → 2
countXX("xxxx") → 3 */

import java.util.Scanner;

public class CountXX {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String string = input.nextLine();
        System.out.println(countXX(string));
    }
    public static int countXX(String str) {
        int result = 0;
        
        for (int i = 0; i < str.length()-1; i++){
          if (str.substring(i, i+2).equals("xx")){
            result++;
          }
        }
        return result;
    }
}
