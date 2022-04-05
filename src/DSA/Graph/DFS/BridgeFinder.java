package DSA.Graph.DFS;

import java.util.ArrayList;
import java.util.Scanner;

public class BridgeFinder {
    public static ArrayList<Integer>[] graph = new ArrayList[7];
    public static int[] in = new int[7];
    public static int[] low = new int[7];
    public static int[] vis = new int[7];
    public static int timer = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        for(int i = 0;i<m;i++) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            add(u,v);
        }
        dfs(1,-1);
    }

    public static void dfs(int s,int p) {
        vis[s] = 1;
        in[s] = low[s] = timer++;
        for(int u : graph[s]) {
            if(u == p) {
             continue;
            }
            if(vis[u] == 1) {
                low[s] = Math.min(low[s],in[u]);
            } else {
                dfs(u,s);
                if(low[u] > in[s]) {
                    System.out.println(s + "->" + u +" is a back edge");
                }
                low[s] = Math.min(low[s], low[u]);
            }
        }
    }

    public static void add(int s,int d) {
        if(graph[s] == null) {
            graph[s] = new ArrayList<>();
        }
        graph[s].add(d);

        if(graph[d] == null) {
            graph[d] = new ArrayList<>();
        }
        graph[d].add(s);
    }
}
