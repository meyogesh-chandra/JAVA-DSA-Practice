package PatternPrinting;

import java.util.Scanner;

public class BinaryTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();

        for(int i = 1; i<=n;i++){// no of line
            for(int j=1;j<=i;j++){//no of star in line
                if((i+j)%2==0) { // System.out.print(j+" ");
                    System.out.print(1+" ");
                }else{
                    System.out.print(0+" ");
                }
            }
            System.out.println();
        }
    }
}
