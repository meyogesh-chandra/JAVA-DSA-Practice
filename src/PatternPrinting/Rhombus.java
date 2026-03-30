package PatternPrinting;

import java.util.Scanner;

public class Rhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();

        for(int i = 1; i<=n;i++){// no of line
            for(int j=1;j<=n-i;j++){//no of star in line
                System.out.print("  ");
            }
            for(int j=1; j<=n;j++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
