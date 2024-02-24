public class SmallestElement_Array {
    public static void main(String[] args) {
        int [] arr = {34,65,87,92,61,77,102,16,27,33};
        int small = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] < small){
                small = arr[i];
            }
        }
        System.out.println(small);
    }
}
