package DSA.Graph.DFS;

import java.util.ArrayList;

public class SSSPonTree {
    public static ArrayList<Integer>[] graph = new ArrayList[7];
    public static int[] dist = new int[7];
    public static int[] vis = new int[7];
    public static void main(String[] args) {
        add(1,3);
        add(1,4);
        add(3,2);
        add(2,5);
        add(2,6);
        dfs(1,0);
        for(int i = 1;i< dist.length;i++) {
            System.out.println("dist of " + i + " from 1 is:" + dist[i]);
        }
    }
    public static void dfs(int s,int level) {
        vis[s] = 1;
        dist[s] = level;

        for(int u:graph[s]) {
            if(vis[u] == 0) {
                dfs(u,level + 1);
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
