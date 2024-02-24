import java.util.Arrays;

public class SecondLargest_Array {
    public static void main(String[] args) {
        int arr[] = {4,2,9,6,12,3,24,7,8};
        int big = arr[0];

        for (int i = 0; i < arr.length; i++){
            if(arr[i] > big){
                big = arr[i];
            }
        }
        Arrays.sort(arr);
        System.out.println(arr[arr.length-2]);
    }
}
