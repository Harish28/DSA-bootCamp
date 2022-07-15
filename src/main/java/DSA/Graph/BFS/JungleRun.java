package DSA.Graph.BFS;

import javafx.util.Pair;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class JungleRun {
    private static int[][] vis = new int[31][31];
    private static int[][] dist = new int[31][31];
    private static char[][] graph = new char[31][31];
    private static int n;
    private static int m;
    private static int[] X = {1,-1,0,0};
    private static int[] Y = {0,0,1,-1};
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        bfs(1,1);

    }
    public static boolean isValid(int i ,int j) {
        if(i < 1 || i > n || j < 1 || j > m || vis[i][j] == 1 || graph[i][j] == 'T') {
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
