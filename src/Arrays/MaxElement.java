package Arrays;

public class MaxElement {
    public static void main(String[] args) {
        int[] arr = {-6,3,43,234,12,34,54,32};
        int mx = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length;i++){
            if (arr[i]>mx){
                mx=arr[i];
            }
        }
        System.out.println(mx);
    }
}
