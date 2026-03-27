package Arrays;

public class ProductofArray {
    public static void main(String[] args) {
       int[] arr ={3,7,3,8,1,4,-2,6,-3};
       int product = 1;
       for (int i = 0; i<arr.length;i++){
           product*=arr[i];
       }
        System.out.println(product);
    }
}
