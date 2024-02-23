public class LargestElement_Array {
    public static void main(String[] args) {
        int arr[] = {2,5,7,1,9,14,29,3,64,8};
        int big = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > big){
                big = arr[i];
            }
        }
        System.out.println(big);
    }
}