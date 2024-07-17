/*Given 2 int values greater than 0, return whichever value is nearest to 21 without going over. 
Return 0 if they both go over.


blackjack(19, 21) → 21
blackjack(21, 19) → 21
blackjack(19, 22) → 19 */

public class BlackJack {

    public static void main(String[] args) {
        System.out.println(blackjack(19, 21)); // Expected output: 21
        System.out.println(blackjack(21, 19)); // Expected output: 21
        System.out.println(blackjack(19, 22)); // Expected output: 19
    }
    
    public static int blackjack(int a, int b) {
        if (a > 21 && b > 21){
            return 0;
          }
          
          if(a<21 && b>21){
            return a;
          }
          
          if(a>21 && b<21){
            return b;
          }
          
          int diffA = Math.abs(a-21);
          int diffB = Math.abs(b-21);
          
          if(diffA <= diffB){
            return a;
          }else{
            return b;
          }
    }
}