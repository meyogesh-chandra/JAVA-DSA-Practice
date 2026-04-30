package Backtracking;

public class RatinMaze {
    public static void main(String[] args) {
        int m = 3, n=3;
        boolean[][] visited = new boolean[m][n];
        System.out.println(paths(0,0,m-1,n-1,visited,""));
    }
    private static int paths(int r,int c,int er,int ec,boolean[][] visited,String s) {
        if (r == er && c == ec){

            System.out.println(s);
            return 1;
    }
        if(r>er || c>ec || r<0 || c<0 || visited[r][c]==true) return 0;
        visited[r][c]=true;
        int left = paths(r,c-1,er,ec,visited,s+"L");
        int up=paths(r-1,c,er,ec,visited,s+"U");
        int right = paths(r,c+1,er,ec,visited,s+"R");

        int down = paths(r+1,c,er,ec,visited,s+"D");
        visited[r][c]=false;//backtracking
        return right+left+up+down;
    }
}
