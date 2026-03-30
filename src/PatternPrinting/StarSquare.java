package PatternPrinting;

import java.util.Scanner;

public class StarSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();

        for(int i = 1; i<=n;i++){// no of line
            for(int j=1;j<=n;j++){//no of star in line
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
