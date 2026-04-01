package Recursion;

import java.util.Scanner;

public class Reverse {
    public static void revers(int n,int r){
        if (n==0){
            System.out.println(r);
            return;
        }
        revers(n/10,r*10+n%10);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        revers(n,0);
    }
}
