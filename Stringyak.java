/*
Suppose the string "yak" is unlucky. Given a string, return a version where all the "yak" are 
removed, but the "a" can be any char. The "yak" strings will not overlap.

stringYak("yakpak") → "pak"
stringYak("pakyak") → "pak"
stringYak("yak123ya") → "123ya" */

public class Stringyak {
    public static void main(String[] args) {
        // Example usage
        System.out.println(stringYak("yakpak")); // Output: "pak"
        System.out.println(stringYak("pakyak")); // Output: "pak"
        System.out.println(stringYak("yak123ya")); // Output: "123ya"
    }

    public static String stringYak(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            // Look for 'yak' starting at index i
            if (i + 2 < str.length() && str.charAt(i) == 'y' && str.charAt(i + 2) == 'k') {
                // Skip the 'yak' substring
                i = i + 2;
            } else {
                // Append the current character to the result
                result = result + str.charAt(i);
            }
        }

        return result;
    }
}

