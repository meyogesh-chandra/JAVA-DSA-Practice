package Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {12,3,27,53,18,62,88,6};
        int target = 53;
        for (int i = 0; i<arr.length;i++){
            if(arr[i]==target){
                System.out.println("Element found at: "+i);
            }
        }
    }
}
