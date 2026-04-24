package DynamicProgramming;

import java.util.Scanner;

public class fiboDp {
    static int[] dp;
     static int fibo(int n){
        if (n<=1) return n;
        if(dp[n]!=0) return dp[n];
        int ans= fibo(n-1)+fibo(n-2);
        dp[n]=ans;
        return dp[n];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        dp = new int[n+1];
        System.out.println(fibo(n));

    }
}
