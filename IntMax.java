/*Given three int values, a b c, return the largest.

intMax(1, 2, 3) → 3
intMax(1, 3, 2) → 3
intMax(3, 2, 1) → 3 */

import java.util.Scanner;

public class IntMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = input.nextInt();
        System.out.println(intMax(num1, num2, num3));
    }
    public static int intMax(int a, int b, int c) {
        return Math.max(Math.max(a,b),c);
      }
}
