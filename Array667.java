public class Array667 {
    public static void main(String[] args) {
        // Example usage of the array667 method
        int[] nums1 = {6, 6, 2};
        int[] nums2 = {6, 6, 2, 6};
        int[] nums3 = {6, 7, 2, 6};

        System.out.println("Count for nums1: " + array667(nums1));
        System.out.println("Count for nums2: " + array667(nums2));
        System.out.println("Count for nums3: " + array667(nums3));
    }

    public static int array667(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 6) {
                if (nums[i + 1] == 6 || nums[i + 1] == 7) {
                    count++;
                }
            }
        }
        return count;
    }
}

