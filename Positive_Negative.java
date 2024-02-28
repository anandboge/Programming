import java.util.Scanner;

public class Positive_Negative {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int n = in.nextInt();
        if (n>0){
            System.out.println("Positive");
        }
        else if (n==0){
            System.out.println("Zero");
        }
        else{
            System.out.println("Negative");
        }
    }
}
