import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        
        if (num%2==0) {
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}
