package DSA.Graph.DFS;

import java.util.ArrayList;
import java.util.Scanner;

public class SubtreeSizeOfTree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer>[] graph = new ArrayList[n+1];
        int[] vis = new int[n+1];
        int[] subTreeSize = new int[n+1];
        for(int i = 1; i<n;i++) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            add(u,v,graph);
        }
        dfs(1,graph,vis,subTreeSize);
        for(int i = 1; i<= n;i++) {
            System.out.println("Subtree Size for node " + i + " is " + subTreeSize[i]);
        }
    }
    public static int dfs(int s,ArrayList<Integer>[] graph, int[] vis,int[] subTreeSize) {
        vis[s] = 1;
        int size = 1;
        for(int u : graph[s]) {
            if(vis[u] == 0) {
                size += dfs(u,graph,vis,subTreeSize);
            }
        }
        subTreeSize[s] = size;
        return size;
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
