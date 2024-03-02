import java.util.Scanner;

public class FirstNOddNums {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a = in.nextInt();
        for(int i=1;i<=a;i+=2){
            System.out.print(i +" ");
    }
}
