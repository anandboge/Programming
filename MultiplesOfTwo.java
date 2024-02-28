import java.util.Scanner;

public class MultiplesOfTwo {
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = in.nextInt();
        for (int i = 2; i <= n; i += 2) {
            System.out.print(i + " ");
    }
}
}
