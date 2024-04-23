/*
Given an array of ints, return the number of 9's in the array.


arrayCount9([1, 2, 9]) → 1
arrayCount9([1, 9, 9]) → 2
arrayCount9([1, 9, 9, 3, 9]) → 3 */

public class ArrayCount9 {
    public static void main(String[] args) {

        int[] nums1 = {1, 2, 9};
        int[] nums2 = {1, 9, 9};

        System.out.println("Number of 9s in nums1: " + arrayCount9(nums1));
        System.out.println("Number of 9s in nums2: " + arrayCount9(nums2));
        
    }
    public static int arrayCount9(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (num == 9) {
                count++;
            }
        }
        return count;
    }
}
