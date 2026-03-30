package PatternPrinting;

import java.util.Scanner;

public class FloydsTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int a = 1;

        for(int i = 1; i<=n;i++){// no of line
            for(int j=1;j<=i;j++){//no of star in line
                // System.out.print(j+" ");
                System.out.print(a+" ");
                a++;
            }
            System.out.println();
        }
    }
}
