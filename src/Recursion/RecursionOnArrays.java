package Recursion;

public class RecursionOnArrays {
    public static void main(String[] args) {
       int[] arr = {5,3,7,12,76,9,34,5};
       print(arr,0);
    }
    public static void print(int[] arr,int indx ){
       int n = arr.length;
       if(indx == n) return;
        System.out.println(arr[indx]);
        print(arr,indx+1);
    }
}
