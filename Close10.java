/*Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event of a tie.
 Note that Math.abs(n) returns the absolute value of a number.

close10(8, 13) → 8
close10(13, 8) → 8
close10(13, 7) → 0 */

import java.util.Scanner;

public class Close10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = in.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = in.nextInt();
        System.out.println(close10(num1, num2));
    }
    public static int close10(int a, int b) {
        if (Math.abs(a - 10) < Math.abs(b -10)){
          return a;
        }
        if (Math.abs(a - 10) > Math.abs(b -10)){
          return b;
        }
        return 0;
    }
}
