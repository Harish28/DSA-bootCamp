package DSA.Recursion;

public class NQueen {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        System.out.println(nQueen(board,0));
    }
    public static int nQueen(boolean[][] board,int r) {
        if(r == board.length) {
            printBoard(board);
            return 1;
        }
        int ans = 0;
        for (int i = 0; i<board.length;i++) {
            if(isValidPlace(board,r,i)) {
                board[r][i] = true;
                ans += nQueen(board,r+1);
                board[r][i] = false;
            }
        }
        return ans;
    }

    private static boolean isValidPlace(boolean[][] board, int r, int c) {
        for(int i= 0 ;i <= r;i++) {
            if(board[i][c]) {
                return false;
            }
        }
        int maxLeft = Math.min(r,c);
        for(int i = 1;i <= maxLeft;i++) {
            if(board[r-i][c-i]) {
                return false;
            }
        }

        int minLeft = Math.min(r, board.length - c -1) ;
        for(int i = 1;i <= minLeft;i++) {
            if(board[r-i][c+i]) {
                return false;
            }
        }
        return true;
    }


    public static void printBoard(boolean[][] board) {
        for (int i = 0; i< board.length;i++) {
            for (int j = 0 ;j < board.length;j++) {
                if(board[i][j]) {
                    System.out.print("Q ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
