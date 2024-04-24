/*
Given an array of ints, return true if one of the first 4 elements in the array is a 9. The array length may be less than 4.

arrayFront9([1, 2, 9, 3, 4]) → true
arrayFront9([1, 2, 3, 4, 9]) → false
arrayFront9([1, 2, 3, 4, 5]) → false */

public class ArrayFront9 {
    
    public static void main(String[] args) {
        int[] nums = {1, 2, 9, 3, 4}; // Example input array
        boolean result = arrayFront9(nums);
        System.out.println(result); // Output: true
    }
    public static boolean arrayFront9(int[] nums) {
      int a = nums.length;
      if(a > 4) {a = 4;}
      
       for (int i=0; i<a; i++) {
        if (nums[i] == 9) 
        return true;
      }
      return false;
    }
}
