import java.util.Scanner;

public class HighestCommanFactor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int n = in.nextInt();
        System.out.print("Enter the second number: ");
        int m = in.nextInt();
        int a = 0;
        for (int i = 1; i <= n; ++i) {
            if (n % i == 0 && m % i == 0) {
                a = i;
            }
        }
        System.out.println(a);
    }
}
