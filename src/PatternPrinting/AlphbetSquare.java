package PatternPrinting;

import java.util.Scanner;

public class AlphbetSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();

        for(int i = 1; i<=n;i++){// no of line
            for(int j=0;j<n;j++){//no of star in line
                System.out.print((char)('A'+j)+" ");
            }
            System.out.println();
        }
    }
}
