package BinarySearch;

public class BinarySearch {
    public static int BS(int[] arr,int target){
        int low = 0;
        int hi = arr.length-1;
        while(low<=hi){
            int mid = (low+hi)/2;
            if(arr[mid]==target) return mid;
            else if(arr[mid]>target) hi=mid-1;
            else low=mid+1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {2,87,345,984,2345,9876};
        int target = 87;
        int ans = BS(arr,target);
        System.out.println(ans);
    }
}
