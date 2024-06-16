public class Trapping_Rain_Water {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };

        int result = 0;

        for(int i = 1; i < arr.length; i++) {
            int leftMax = arr[i];
            for(int j = 0; j < i; j++) {
                if(arr[j] > leftMax){
                    leftMax = arr[j];
                }
            }

            int rightmax = arr[i];
            for(int k = i + 1; k < arr.length; k++) {
                if(arr[k] > rightmax){
                    rightmax = arr[k];
                }
            }
            int smallest = Math.min(leftMax, rightmax);

            result += smallest - arr[i];
        }
        System.out.println(result);
    }
}