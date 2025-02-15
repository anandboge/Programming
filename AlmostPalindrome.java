/*Almost Palindrome

A palindrome is a string that reads the same backward or forward.
For example:
"racecar", "mom", "madam" are all palindromes, while "father" isn't.

An almost palindrome is a string that is either a palindrome, or can be turned into a palindrome by changing at most 1 character in it.
For example:
"racecar", "mom", "madam" are all almost palindromes because they are also palindromes.
"racebar" is also an almost palindrome, because it can turn into a palindrome by changing the 'b' character to a 'c' character (or the opposite, changing the 'c' to 'b').
"abcdcab" is not almost a palindrome, because in order to turn into a palindrome, it needs changing in at least 2 characters.

Challenge
Write a function named isAlmostPalindrome that gets a string as an input, returns true if the string is almost a palindrome, and returns false elsewise. */

public class AlmostPalindrome {
    public static boolean isAlmostPalindrome(String s){
        int left = 0;
        int right = s.length()-1;
        int misMatchCount = 0;

        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                misMatchCount += 1;
            }

            // If more than 1 mismatch is found, return false
            if(misMatchCount > 1){
                return false;
            }
            left++;
            right--;
        }
        // If there is at most 1 mismatch, return true
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isAlmostPalindrome("racecar"));  // true
        System.out.println(isAlmostPalindrome("mom"));      // true
        System.out.println(isAlmostPalindrome("madam"));    // true
        System.out.println(isAlmostPalindrome("racebar"));  // true
        System.out.println(isAlmostPalindrome("abcdcab")); // false
    }
}

/*The method public static boolean isAlmostPalindrome(String s) is defined as:

public: The method can be accessed from anywhere.
static: You can call the method without creating an instance of the class.
boolean: The method returns a boolean value (true or false).
isAlmostPalindrome: The method's name.
String s: The parameter (input string) that the method will check.

static:
This keyword means the method belongs to the class itself, rather than an instance of the class.
A static method can be called directly from the class without creating an instance of the class.
Since the main method (where you're calling isAlmostPalindrome) is also static, you need to make 
isAlmostPalindrome static as well in order to call it from the main method.*/
