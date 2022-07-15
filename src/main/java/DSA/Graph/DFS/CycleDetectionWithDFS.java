package DSA.Graph.DFS;

import java.util.ArrayList;

public class CycleDetectionWithDFS {
    public static ArrayList<Integer>[] graph = new ArrayList[6];
    public static int[] vis = new int[6];

    public static void main(String[] args) {
        add(1,2);
        add(2,3);
        add(3,4);
        add(4,5);
        add(4,2);
        //add(5,6);
        //add(3,6);
        System.out.println(dfs(1,-1));
    }
    public static boolean dfs(int s,int p) {
        vis[s] = 1;
        for(int u:graph[s]) {
            if(vis[u] != 0) {
                if(u != p) {
                    return true;
                }
            } else {
                if(dfs(u,s)) {
                    return true;
                }
            }
        }
        return false;
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
