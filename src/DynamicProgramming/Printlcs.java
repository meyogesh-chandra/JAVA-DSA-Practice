package DynamicProgramming;

public class Printlcs {
    public static void main(String[] args) {
        String s1 = "anuj";
        String s2 = "anjum";
        int m = s1.length(),n=s2.length();
        int[][] dp = new int[m+1][n+1];
        for(int i = 1;i<=m;i++){
            for(int j = 1;j<=n;j++){

                if(s1.charAt(i-1)==s2.charAt(j-1)) dp[i][j]=1+dp[i-1][j-1];
                else dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);

            }
        }
        // now printing lcs
        int i = m, j = n;
        StringBuilder ans = new StringBuilder();
        while(i>0 && j>0){

            if(s1.charAt(i-1)==s2.charAt(j-1)){
                ans.append(s1.charAt(i-1));
                i--;
                j--;
            }
            else{
                if(dp[i-1][j]>=dp[i][j-1]) i--;
                else j--;
            }
        }
        System.out.println(ans.reverse());
    }
}
