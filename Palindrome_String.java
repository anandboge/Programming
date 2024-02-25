public class Palindrome_String {
    public static void main(String[] args) {
        int num = 6886;
        String str1 = Integer.toString(num);
        String str2 = "";
    
        for(int i = str1.length()-1; i >= 0; i--){
            str2 += str1.charAt(i);
        }
        System.out.println(str2);
        
        if (str1.equals(str2)) {
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
    }
}
