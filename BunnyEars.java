/*We have a number of bunnies and each bunny has two big floppy ears. We want to compute the total number of ears across 
all the bunnies recursively (without loops or multiplication).


bunnyEars(0) → 0
bunnyEars(1) → 2
bunnyEars(2) → 4 */

public class BunnyEars {
    public static void main(String[] args) {
        System.out.println(bunnyEars(0)); // Output: 0
        System.out.println(bunnyEars(1)); // Output: 2
        System.out.println(bunnyEars(2)); // Output: 4
        // You can test with more bunnies
        System.out.println(bunnyEars(5)); // Output: 10
    }

    public static int bunnyEars(int bunnies) {
        // Base case: no bunnies means no ears
        if (bunnies == 0) {
            return 0;
        }
        // Recursive case: each bunny has 2 ears
        return 2 + bunnyEars(bunnies - 1);
    }
}