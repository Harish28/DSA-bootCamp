package DSA.Graph.DFS;

import java.util.ArrayList;

public class CycleDetectionInDirectedGraphWithDFS {
    public static ArrayList<Integer>[] graph = new ArrayList[6];
    public static int[] vis = new int[6];

    public static void main(String[] args) {
        add(1,2);
        add(2,3);
        add(3,4);
        add(4,5);
        add(5,1);
        //add(4,2);

        System.out.println("Cycle Status :" + dfs(1));
    }

    public static boolean dfs(int s) {
        vis[s] = 1;
        if(graph[s] != null) {
            for(int u:graph[s]) {
                if(vis[u] == 0) {
                    if(dfs(u) == true) {
                        return true;
                    }
                } else if(vis[u] == 1) {
                    return true;
                }
            }
        }
        vis[s] = 2;
        return false;
    }

    public static void add(int s,int d) {
        if(graph[s] == null) {
            graph[s] = new ArrayList<>();
        }
        graph[s].add(d);
    }
}
