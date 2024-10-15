/*Count recursively the total number of "abc" and "aba" substrings that appear in the given string.


countAbc("abc") → 1
countAbc("abcxxabc") → 2
countAbc("abaxxaba") → 2 */

public class CountAbc {

    public static void main(String[] args) {
        System.out.println(countAbc("abc")); // Output: 1
        System.out.println(countAbc("abcxxabc")); // Output: 2
        System.out.println(countAbc("abaxxaba")); // Output: 2
    }
    
    public static int countAbc(String str) {
        int count = 0;
        
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 3).equals("abc")) {
                count++;
            } else if (str.substring(i, i + 3).equals("aba")) {
                count++;
            }
        }
        
        return count;
    }
}