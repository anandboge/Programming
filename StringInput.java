import java.util.Scanner;

public class StringInput {
    public static void main(String[] args) {
        
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String str = input.next();
		System.out.println(str + " " + str.length());
//		//delimiter
//		String str1 = input.next();
		String str1 = input.nextLine();
		System.out.println(str1 + " " + str1.length());
    }
}
