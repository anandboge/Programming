import java.util.Scanner;

public class LargestOfFourNums {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = in.nextInt();
        System.out.print("Enter the second number: ");
        int b = in.nextInt();
        System.out.print("Enter the third number: ");
        int c = in.nextInt();
        System.out.print("Enter the fourth number: ");
        int d = in.nextInt();
        System.out.println("Largest number is: " +Math.max(Math.max(a,b),Math.max(c,d)));
    }
}
