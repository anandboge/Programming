/*
The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text. In this example, 
the "i" tag makes <i> and </i> which surround the word "Yay". Given tag and word strings, 
create the HTML string with tags around the word, e.g. "<i>Yay</i>".

makeTags("i", "Yay") → "<i>Yay</i>"
makeTags("i", "Hello") → "<i>Hello</i>"
makeTags("cite", "Yay") → "<cite>Yay</cite>" */

public class MakeTags{
    public static void main(String[] args) {
        System.out.println(makeTags("i", "Yay")); // Output: "<i>Yay</i>"
        System.out.println(makeTags("i", "Hello")); // Output: "<i>Hello</i>"
        System.out.println(makeTags("cite", "Yay")); // Output: "<cite>Yay</cite>"
    }
    public static String makeTags(String tag, String word) {
        return "<" +tag+ ">" + word+ "</" +tag+ ">";
      }
      
}