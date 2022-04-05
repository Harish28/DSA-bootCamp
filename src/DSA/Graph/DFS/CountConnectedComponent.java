package DSA.Graph.DFS;

import java.util.ArrayList;
import java.util.Scanner;

public class CountConnectedComponent {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int e = scanner.nextInt();
        ArrayList<Integer>[] graph = new ArrayList[n+1];
        while(e > 0) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            if(graph[u] == null) {
             graph[u] = new ArrayList<>();
            }
            graph[u].add(v);
            if(graph[v] == null) {
                graph[v] = new ArrayList<>();
            }
            graph[v].add(u);
            e--;
        }
        System.out.println(countCC(graph));
    }

    public static int countCC(ArrayList<Integer>[] graph) {
        int cc = 0;
        int[] visited = new int[graph.length];
        for(int i = 1 ; i <= graph.length;i++) {
            if(visited[i] != 1) {
                dfs(graph,i,visited);
                cc++;
            }
        }
        return cc;
    }
    public static void dfs(ArrayList<Integer>[] graph,int v,int[] visited) {
        visited[v] = 1;
        if(graph[v] != null) {
            for(int u : graph[v]) {
                if(visited[u] != 1) {
                    dfs(graph,u,visited);
                }
            }
        }
    }
}
