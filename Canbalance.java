/*Given a non-empty array, return true if there is a place to split the array so that the sum of the numbers on one side 
is equal to the sum of the numbers on the other side.


canBalance([1, 1, 1, 2, 1]) → true
canBalance([2, 1, 1, 2, 1]) → false
canBalance([10, 10]) → true */

public class Canbalance {
    public static boolean canBalance(int[] nums) {
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        int leftSum = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            leftSum += nums[i];
            int rightSum = totalSum - leftSum;

            if (leftSum == rightSum) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(canBalance(new int[]{1, 1, 1, 2, 1})); // true
        System.out.println(canBalance(new int[]{2, 1, 1, 2, 1})); // false
        System.out.println(canBalance(new int[]{10, 10})); // true
    }
}
