/*Given a number n, create and return a new string array of length n, containing the strings "0", "1" "2" .. through n-1. 
N may be 0, in which case just return a length 0 array. Note: String.valueOf(xxx) will make the String form of most types. 
The syntax to make a new string array is: new String[desired_length] 


fizzArray2(4) → ["0", "1", "2", "3"]
fizzArray2(10) → ["0", "1", "2", "3", "4", "5", "6", "7", "8", "9"]
fizzArray2(2) → ["0", "1"] */

import java.util.Arrays;

public class FizzArray2{
     public static void main(String[] args) {
        // Test the method with various values of n
        System.out.println(Arrays.toString(fizzArray2(4)));  // Output: ["0", "1", "2", "3"]
        System.out.println(Arrays.toString(fizzArray2(10))); // Output: ["0", "1", "2", "3", "4", "5", "6", "7", "8", "9"]
        System.out.println(Arrays.toString(fizzArray2(2)));  // Output: ["0", "1"]
    }

    public static String[] fizzArray2(int n) {
        // Create a new array of Strings with length n
        String[] result = new String[n];
        
        // Populate the array with string representations of numbers from 0 to n-1
        for (int i = 0; i < n; i++) {
            result[i] = String.valueOf(i);
        }
        
        return result;
    }
}