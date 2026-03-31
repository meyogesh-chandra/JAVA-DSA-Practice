package Arrays2D;

import java.util.Scanner;

public class Outputin2DArray {
    public static void main(String[] args) {
        int[][] arr= new int[3][4];
        //int[][] arr = {{6,3,0,2},{3,5,7,1},{0,9,3,6}};
        System.out.println(arr.length +" "+arr[0].length);

        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<3;i++){
            for(int j=0; j<4;j++){
               arr[i][j]= sc.nextInt();
            }
            System.out.println();
        }

        //output Print
        for(int i = 0; i<3;i++){
            for(int j=0; j<4;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
