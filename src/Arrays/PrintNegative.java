package Arrays;

import java.util.Scanner;

public class PrintNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Array Element: ");
        for (int i = 0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        // negative value
        for(int i = 0;i  <n;i++){
            if(arr[i]<0){
                System.out.println(arr[i]);
            }
        }

    }
}
