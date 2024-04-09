import java.util.Scanner;

public class StringBits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String string = input.nextLine();
        System.out.println(stringBits(string));
    }

    public static String stringBits(String str) {
        String str1 = "";
        
        for (int i = 0; i < str.length(); i+=2){
          str1 = str1 + str.substring(i, i+1);
        }
        return str1;
      }
}
