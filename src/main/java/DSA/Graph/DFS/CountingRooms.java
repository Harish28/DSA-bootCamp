package DSA.Graph.DFS;

import java.sql.SQLOutput;
import java.util.Scanner;

//https://cses.fi/problemset/task/1192/
public class CountingRooms {
    private static int n ;
    private static int m ;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         n = scanner.nextInt();
         m = scanner.nextInt();
        String[][] grid = new String[n+1][m+1];
        int[][] vis = new int[n+1][m+1];
        for(int i = 1 ; i<=n;i++) {
            for(int j =  1; j<=m;j++) {
                grid[i][j] = scanner.next();
            }
        }
        System.out.println(findNoOfRooms(grid,vis));
    }
    public static int findNoOfRooms(String[][]grid,int[][] vis) {
        int count = 0;
        for(int i = 1 ; i<= grid.length;i++) {
            for(int j =  1; j<=grid[0].length;j++) {
                if(grid[i][j].equals(".") && vis[i][j] == 0) {
                    dfs(i,j,grid,vis);
                    count++;
                }
            }
        }
        return count;
    }

    public static boolean isValid(int i ,int j,int[][] vis,String[][]grid) {
        if(i < 1 || i > n || j < 1 || j > m || vis[i][j] == 1 || grid[i][j].equals("#")) {
            return false;
        }
        return true;
    }
    public static void dfs(int i ,int j,String[][]grid,int[][] vis) {
        vis[i][j] = 1;
        if(isValid(i+1,j,vis,grid)) {
            dfs(i+1,j,grid,vis);
        }
        if(isValid(i-1,j,vis,grid)) {
            dfs(i-1,j,grid,vis);
        }
        if(isValid(i,j+1,vis,grid)) {
            dfs(i,j+1,grid,vis);
        }
        if(isValid(i,j-1,vis,grid)) {
            dfs(i,j-1,grid,vis);
        }
    }
}
