import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        System.out.print("Enter marks: ");
        int n = input.nextInt();
        if(n>90){
            System.out.println("A+");
        }
        else if(n>80 || n==90){
            System.out.println("A");
        }
        else if(n>70 || n==80){
            System.out.println("B+");
        }
        else if(n>60 || n==70){
            System.out.println("B");
        }
        else if(n>50 || n==60){
            System.out.println("C+");
        }
        else if(n>40 || n==50){
            System.out.println("C");
        }
        else if(n<0 || n>100){
            System.out.println("invalid");
        }
        else{
            System.out.println("Fail");
        }
    }
}
