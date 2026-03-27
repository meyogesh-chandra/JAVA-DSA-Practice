package Functions;

import java.util.Scanner;

public class PermutationandCombination {
    public static int fact(int a){
        int fact = 1;
        for (int i=1; i<=a;i++){
            fact*=i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int ncr = fact(n)/fact(r)*fact(n-r);
        System.out.println(ncr);

    }
}
