/*
Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".


helloName("Bob") → "Hello Bob!"
helloName("Alice") → "Hello Alice!"
helloName("X") → "Hello X!" */

public class HelloName {
    public static void main(String[] args) {
        
        System.out.println(helloName("Bob")); // Output: "Hello Bob!"
        System.out.println(helloName("Alice")); // Output: "Hello Alice!"
        System.out.println(helloName("X")); // Output: "Hello X!"
    }
    public static String helloName(String name) {
        return "Hello" +" "+ name +"!";
      }
      
}
