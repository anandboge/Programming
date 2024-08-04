/*A sandwich is two pieces of bread with something in between. Return the string that is between the first and 
last appearance of "bread" in the given string, or return the empty string "" if there are not two pieces of bread.


getSandwich("breadjambread") → "jam"
getSandwich("xxbreadjambreadyy") → "jam"
getSandwich("xxbreadyy") → "" */

public class GetSandwich {

    public static void main(String[] args) {
        System.out.println(getSandwich("breadjambread")); // Output: jam
        System.out.println(getSandwich("xxbreadjambreadyy")); // Output: jam
        System.out.println(getSandwich("xxbreadyy")); // Output: ""
    }
    
    public static String getSandwich(String str) {
        // Find the index of the first and last occurrence of "bread"
        int firstIndex = str.indexOf("bread");
        int lastIndex = str.lastIndexOf("bread");

        // Check if both occurrences are found and the last index is after the first index
        if (firstIndex != -1 && lastIndex != -1 && lastIndex > firstIndex) {
            // Extract the substring between the two "bread" occurrences
            // firstIndex + 5 to skip the first "bread" and lastIndex to stop at the end of the last "bread"
            return str.substring(firstIndex + 5, lastIndex);
        }

        // Return empty string if there are not two pieces of "bread"
        return "";
    }
}