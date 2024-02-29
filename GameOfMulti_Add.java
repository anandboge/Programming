import java.util.Scanner;

public class GameOfMulti_Add {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int m = in.nextInt();
        System.out.print("Enter the second number: ");
        int n = in.nextInt();
        if (n%2==0 && m%2==0){
            System.out.println("Product: "+ m*n);
        }
        else{
            System.out.println("Sum: "+ (n+m));
        }
    }
}
