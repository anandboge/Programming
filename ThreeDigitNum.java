import java.util.Scanner;

public class ThreeDigitNum {
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = in.nextInt();
        if (n>=100 && n<1000){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
