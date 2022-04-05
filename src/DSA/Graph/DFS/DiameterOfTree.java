package DSA.Graph.DFS;

import java.util.ArrayList;
import java.util.Scanner;

public class DiameterOfTree {
    private static int maxNode = -1;
    private static int longestPathLength = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer>[] graph = new ArrayList[n+1];
        int[] vis = new int[n+1];
        for(int i = 1; i<n;i++) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            add(u,v,graph);
        }
        System.out.println(getDiameter(graph,vis));
    }

    private static int getDiameter(ArrayList<Integer>[] graph, int[] vis) {
        dfs(1,0,graph,vis);
        for(int i = 0;i< vis.length;i++) {
            vis[i] = 0;
        }
        longestPathLength = 0;
        dfs(maxNode,0,graph,vis);
        return longestPathLength;
    }


    public static void dfs(int s,int level,ArrayList<Integer>[] graph,int[] vis) {
        vis[s] = 1;
        if(longestPathLength < level) {
            longestPathLength = level;
            maxNode = s;
        }
        for(int u : graph[s]) {
            if(vis[u] == 0) {
                dfs(u,level + 1,graph,vis);
            }
        }
    }
    public static void add(int s,int d,ArrayList<Integer>[] graph) {
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
