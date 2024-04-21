public class StringSplosion {
    public static void main(String[] args) {
         // Example input string
         String input = "hello";
        
         // Call the stringSplosion method
         String result = stringSplosion(input);
         
         // Print the result
         System.out.println("Result: " + result);
    }
     public static String stringSplosion(String str) {
        String str1 = "";
        for (int i = 0; i < str.length(); i++) {
            str1 += str.substring(0, i + 1);
        }
        return str1;
    }
}
