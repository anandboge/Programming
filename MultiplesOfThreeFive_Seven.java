import java.util.Scanner;

public class MultiplesOfThreeFive_Seven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = input.nextInt();
        if (n%3==0 && n%5==0 && n%7==0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
