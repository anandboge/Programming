/*We have triangle made of blocks. The topmost row has 1 block, the next row down has 2 blocks, the next row has 3 blocks, 
and so on. Compute recursively (no loops or multiplication) the total number of blocks in such a triangle with the given 
number of rows.


triangle(0) → 0
triangle(1) → 1
triangle(2) → 3 */

public class Triangle{
    public static int triangle(int n){
        if(n == 0) return 0;
        return n + triangle(n - 1);
    }
    
    public static void main(String[] args){
        System.out.println(triangle(5)); // Output: 15
        System.out.println(triangle(10)); // Output: 55
        System.out.println(triangle(0)); // Output: 0
    }
}