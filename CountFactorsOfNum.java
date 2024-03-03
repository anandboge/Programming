import java.util.Scanner;

public class CountFactorsOfNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a = in.nextInt();
        int b=0;
        for(int i = 1; i<=a; i++){
            if(a%i==0){
                b++;
                //System.out.print(i +" ");
            }
        }
        System.out.println(b);
    }
}
