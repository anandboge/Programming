/*You have a blue lottery ticket, with ints a, b, and c on it. This makes three pairs, which we'll call ab, bc, and ac. 
Consider the sum of the numbers in each pair. If any pair sums to exactly 10, the result is 10. Otherwise if the ab sum 
is exactly 10 more than either bc or ac sums, the result is 5. Otherwise the result is 0.


blueTicket(9, 1, 0) → 10
blueTicket(9, 2, 0) → 0
blueTicket(6, 1, 4) → 10 */

public class BlueTicket {

    public static void main(String[] args) {
        System.out.println(blueTicket(9, 1, 0)); // 10
        System.out.println(blueTicket(9, 2, 0)); // 0
        System.out.println(blueTicket(6, 1, 4)); // 10
    }
    
    public static int blueTicket(int a, int b, int c) {
        int s1 = a + b;
        int s2 = b + c;
        int s3 = a + c;
        
        if(s1 == 10 || s2 == 10 || s3 == 10){
          return 10;
        }
        else if (s1 - s2 == 10 || s1 - s3 == 10){
          return 5;
        }
        return 0;
    }
}