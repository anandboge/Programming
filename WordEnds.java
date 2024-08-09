/*Given a string and a non-empty word string, return a string made of each char just before and just after 
every appearance of the word in the string. Ignore cases where there is no char before or after the word, 
and a char may be included twice if it is between two words.


wordEnds("abcXY123XYijk", "XY") → "c13i"
wordEnds("XY123XY", "XY") → "13"
wordEnds("XY1XY", "XY") → "11" */

public class WordEnds {

    public static void main(String[] args) {
        System.out.println(wordEnds("abcXY123XYijk", "XY")); // Output: c13i
        System.out.println(wordEnds("XY123XY", "XY")); // Output: 13
        System.out.println(wordEnds("XY1XY", "XY")); // Output: 11
    }
    
    public static String wordEnds(String str, String word) {
        StringBuilder result = new StringBuilder();
        int wordLength = word.length();

        for (int i = 0; i <= str.length() - wordLength; i++) {
            // Check if the substring matches the word
            if (str.substring(i, i + wordLength).equalsIgnoreCase(word)) {
                // Add character before the word if it exists
                if (i > 0) {
                    result.append(str.charAt(i - 1));
                }
                // Add character after the word if it exists
                if (i + wordLength < str.length()) {
                    result.append(str.charAt(i + wordLength));
                }
            }
        }

        return result.toString();
    }
}