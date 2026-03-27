package Arrays;

import java.util.Scanner;

public class OutputInputArray {
    public static void main(String[] args) {
        int[] arr = {5, -8, 2, 67, 43 , -97};
        for (int i = 0; i <=arr.length-1;i++){
         //   System.out.println(arr[i]+" ");
        }
        Scanner sc = new Scanner(System.in);
        int[] karan = new int[7];
        for(int i =0 ; i      <7;i++){
           // System.out.println(karan[i]+ " ");
        }
        //input
        for(int i = 0; i<7;i++){
            int x = sc.nextInt();
            karan[i]= x;
        }
        //print
        for(int i =0 ; i      <7;i++){
            System.out.println(karan[i]+ " ");
        }

    }
}
