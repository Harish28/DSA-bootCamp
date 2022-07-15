package DSA.Graph.DFS;

import java.util.Scanner;

public class DFSOnGrid {
    private static int[][] vis = new int[1001][1001];
    private static int n;
    private static int m;
    private static int[] X = {1,-1,0,0};
    private static int[] Y = {0,0,1,-1};
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        dfs(1,1);
    }
    public static boolean isValid(int i ,int j) {
        if(i < 1 || i > n || j < 1 || j > m || vis[i][j] == 1) {
            return false;
        }
        return true;
    }
    public static void dfs(int i ,int j) {
        vis[i][j] = 1;
        System.out.println(i + "," + j);
        if(isValid(i+1,j)) {
            dfs(i+1,j);
        }
        if(isValid(i-1,j)) {
            dfs(i-1,j);
        }
        if(isValid(i,j+1)) {
            dfs(i,j+1);
        }
        if(isValid(i,j-1)) {
            dfs(i,j-1);
        }
    }
}
