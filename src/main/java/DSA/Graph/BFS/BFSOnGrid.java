package DSA.Graph.BFS;

import javafx.util.Pair;

import javax.swing.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFSOnGrid {
    private static int[][] vis = new int[1001][1001];
    private static int[][] dist = new int[1001][1001];
    private static int n;
    private static int m;
    private static int[] X = {1,-1,0,0};
    private static int[] Y = {0,0,1,-1};
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        bfs(1,1);
        for (int i = 1; i <= n;i++) {
            for(int j = 1; j<=m;j++) {
                System.out.print(dist[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static boolean isValid(int i ,int j) {
        if(i < 1 || i > n || j < 1 || j > m || vis[i][j] == 1) {
            return false;
        }
        return true;
    }
    public static void bfs(int i ,int j) {
        vis[i][j] = 1;
        dist[i][j] = 0;
        Queue<Pair<Integer,Integer>> queue = new LinkedList<>();
        queue.add(new Pair<>(i,j));
        while (!queue.isEmpty()) {
            int x = queue.peek().getKey();
            int y = queue.peek().getValue();
            queue.poll();
            for(int k = 0; k<4;k++) {
                int newX = x + X[k];
                int newY = y + Y[k];
                if(isValid(newX,newY)) {
                    dist[newX][newY] = dist[x][y] + 1;
                    vis[newX][newY] = 1;
                    queue.add(new Pair<>(newX,newY));
                }
            }
        }
    }
}
