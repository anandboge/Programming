import java.util.Scanner;

public class AddThreeNums {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int m = input.nextInt();
        System.out.print("Enter the second number: ");
        int n = input.nextInt();
        System.out.print("Enter the third number: ");
        int k = input.nextInt();
        int sum = m + n + k;
        System.out.println("Sum of three integers: "+sum);
    }
}
