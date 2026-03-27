package SortingAlgo;

public class InsertionSort {
    public static void print(int[] arr ){
        for(int ele: arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {5,-2,6,7,2,8,7,2};
        int n =arr.length;
        print(arr);
        for(int i = 1; i<arr.length;i++){
            int j=i;
            while (j>0 && arr[j]<arr[j-1]){
                int temp = arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;

            }
        }
        print(arr);
    }
}
