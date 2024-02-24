public class SecondSmallestElement_Array {
    public static void main(String[] args) {
        int [] arr = {98,76,65,41,23,54,88,91,49,15,12,8,29};
        int smallest = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] < smallest){
                smallest = arr[i];
            }
        }
        System.out.println("Smallest Element in an Araay: " +smallest);

        int secondSmallest = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] < secondSmallest && arr[i] > smallest){
                secondSmallest = arr[i];
            }
        }
        System.out.println("Second Smallest Element in an Araay: " +secondSmallest);
    }
}
