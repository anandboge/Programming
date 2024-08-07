/*Given 3 int values, a b c, return their sum. However, if one of the values is the same as another 
of the values, it does not count towards the sum.


loneSum(1, 2, 3) → 6
loneSum(3, 2, 3) → 2
loneSum(3, 3, 3) → 0 */

public class LoneSum {

    public static void main(String[] args) {
        System.out.println(loneSum(1, 2, 3)); // Output: 6
        System.out.println(loneSum(3, 2, 3)); // Output: 2
        System.out.println(loneSum(3, 3, 3)); // Output: 0
    }
    
    public static int loneSum(int a, int b, int c) {
        if(a == b && b == c){
            return 0;
          }
          else if(a == b){
            return c;
          }
          else if(b == c){
            return a;
          }
          else if(a == c){
            return b;
          }
          return a + b + c;
    }
}