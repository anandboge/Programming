import java.util.Scanner;

public class CheckPalindrome {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		String str =  input.nextLine();
		System.out.println(check(str.toLowerCase()));

    }
    public static boolean check(String s) {
		String palindrome = "";
		for(int i = s.length()-1; i>=0; i--) {
			palindrome += s.charAt(i);
		}
		if(s.equals(palindrome)) {
			return true;
		}
		return false;
	}
}