package Arrays;

public class LeftRotation {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int k = 2;
        int n=arr.length;
        for(int i = 0; i<k;i++){
            int temp=arr[n-1];
            for(int j=n-1; j>0;j--){
                arr[j]=arr[j-1];
            }
            arr[i]=temp;

        }
        for(int ele:arr){
            System.out.print(ele +" ");
        }
    }
}
