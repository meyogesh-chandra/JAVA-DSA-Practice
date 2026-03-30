package PatternPrinting;

import java.util.Scanner;

public class PyramidMethSecond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int nsp = n-1, nst = 1;

        for(int i = 1; i<=n;i++){// no of line
            for(int j=1;j<=nsp;j++){//no of star in line
                System.out.print("  ");
            }
            for(int j=1; j<=nst;j++){
                System.out.print(" *");
            }
            nsp--;
            nst+=2;
            System.out.println();
        }
    }
}
