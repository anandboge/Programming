/*Given two strings, word and a separator sep, return a big string made of count occurrences of the word, 
separated by the separator string.


repeatSeparator("Word", "X", 3) → "WordXWordXWord"
repeatSeparator("This", "And", 2) → "ThisAndThis"
repeatSeparator("This", "And", 1) → "This" */

public class RepeatSeperator {

    public static void main(String[] args) {
        System.out.println(repeatSeparator("Word", "X", 3)); // Output: WordXWordXWord
        System.out.println(repeatSeparator("This", "And", 2)); // Output: ThisAndThis
        System.out.println(repeatSeparator("This", "And", 1)); // Output: This
    }
    
    public static String repeatSeparator(String word, String sep, int count) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < count; i++) {
            result.append(word);
            if (i < count - 1) {
                result.append(sep);
            }
        }
        return result.toString();
    }
}