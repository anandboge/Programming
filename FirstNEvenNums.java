import java.util.Scanner;

public class FirstNEvenNums {
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a = in.nextInt();
        //int b = 0;
        for(int i=1;i<=a;i++){
           System.out.print(2*i +" ");
           //b+=2*i;
        }
        /*for(int i=0;i<=a;i+=2){
            System.out.print(i +" ");
        }*/
        //System.out.println(b);
    }
}
