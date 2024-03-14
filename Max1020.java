/*Given 2 positive int values, return the larger value that is in the range 10..20 inclusive, or return 0 if neither is in that range.

max1020(11, 19) → 19
max1020(19, 11) → 19
max1020(11, 9) → 11 */

import java.util.Scanner;

public class Max1020 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int m = in.nextInt();
        System.out.print("Enter the second number: ");
        int n = in.nextInt();
        System.out.println(max1020(m, n));
    }
    public static int max1020(int a, int b) {
        if (a >= 10 && a <= 20){
          if(b >= 10 && b <= 20){
            return Math.max(a,b);
          }
          return a;
        }
        else{
          if(b >= 10 && b <= 20){
            return b;
          } 
          return 0;
        }
    }
}
