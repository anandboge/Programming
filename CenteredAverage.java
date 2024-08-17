/*Return the "centered" average of an array of ints, which we'll say is the mean average of the values, 
except ignoring the largest and smallest values in the array. If there are multiple copies of the smallest 
value, ignore just one copy, and likewise for the largest value. Use int division to produce the final average. 
You may assume that the array is length 3 or more.


centeredAverage([1, 2, 3, 4, 100]) → 3
centeredAverage([1, 1, 5, 5, 10, 8, 7]) → 5
centeredAverage([-10, -4, -2, -4, -2, 0]) → -3 */

import java.util.Arrays;

public class CenteredAverage {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 100};
        System.out.println(centeredAverage(arr1));
        
        int[] arr2 = {1, 1, 5, 5, 10, 8, 7};
        System.out.println(centeredAverage(arr2));
        
        int[] arr3 = {-10, -4, -2, -4, -2, 0};
        System.out.println(centeredAverage(arr3));
    }
    
    public static int centeredAverage(int[] nums) {
        int small = Integer.MAX_VALUE;
        int big = Integer.MIN_VALUE;
 
     for(int i=0;i<nums.length;i++) {
 
       if(nums[i]>big)
        big = nums[i];
       if(nums[i]<small)
        small = nums[i];
 
     }
 
     int temp[] = new int[nums.length-2]; int z = 0;
 
     int smalli = 0, bigi = 0; 
 
     for(int i=0;i<nums.length;i++) {
 
        if(smalli==0 && bigi==0) {
 
          if(nums[i]==small) {
            smalli = 1;
          } else if(nums[i]==big) {
            bigi = 1;
          } else {
            temp[z] = nums[i]; z++;
          }
 
        } else if(smalli==1 && bigi==0) {
            if(nums[i]==big) {
              bigi = 1;
            } else {
              temp[z++] = nums[i];
            }
        } else if(smalli==0 && bigi==1){ 
            if(nums[i]==small) {
              smalli=1; 
            } else {
              temp[z++] = nums[i];
            }
        } else {
            temp[z++] = nums[i]; 
        }
     }
 
     Arrays.sort(temp);
 
     if(temp.length%2==1)
      return temp[temp.length/2];
     else {
       int mid = temp.length/2;
      return (temp[mid] + temp[mid-1])/2;
     }
    }
}