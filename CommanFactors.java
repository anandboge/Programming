import java.util.Scanner;

public class CommanFactors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int n = input.nextInt();
        System.out.print("Enter the second number: ");
        int m = input.nextInt();
        int min = Math.min(n, m);
        for (int i = 1; i <= min; i++) {
            if (n % i == 0 && m % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
