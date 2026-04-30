package Backtracking;

public class NQueens {
    public static void main(String[] args) {
        int n=3;
        char[][] chessboard = new char[n][n];
        for(int i =0;i<n;i++){
            for(int j = 0; j<n;j++){
                chessboard[i][j]='X';
            }
        }
        nQueens(0,chessboard);
    }
    static void nQueens(int row,char[][] chessboard){
        int n = chessboard.length;
        if(row==n){
            for(int i =0;i<n;i++){
                for(int j = 0; j<n;j++){
                    System.out.print(chessboard[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println();
            return;
        }
        for(int col = 0;col<n;col++){
            if(queenFit(row,col,chessboard)){
                chessboard[row][col]='Q';//mark
                nQueens(row+1,chessboard);//move next row
                chessboard[row][col]='X';//unmark
            }
        }

    }
    static boolean queenFit(int row,int col,char[][] chessboard){
        int r = row-1;
        int c = col;

        while(r>=0){//check up
            if(chessboard[r][c]=='Q') return false;
            r--;
        }
        r=row-1;
        c=col-1;
        while(r>=0 && c>=0){//left diagonal
            if(chessboard[r][c]=='Q') return false;
            r--;
            c--;
        }
        r=row-1;
        c=col+1;
        while(r>=0 && c<chessboard.length){//right diagonal
            if(chessboard[r][c]=='Q') return false;
            r--;
            c++;
        }
        return true;


    }
}
