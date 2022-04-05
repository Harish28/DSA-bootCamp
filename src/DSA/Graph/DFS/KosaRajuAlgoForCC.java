package DSA.Graph.DFS;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KosaRajuAlgoForCC {
    private static int[] vis = new int[31];
    private static List<Integer> order = new ArrayList<>();
    private static ArrayList<Integer>[] graph = new ArrayList[31];
    private static ArrayList<Integer>[] graphTranspose = new ArrayList[31];
    private static ArrayList<Integer> scc = new ArrayList<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t > 0) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            while(m > 0) {
                m--;
                int u = scanner.nextInt();
                int v = scanner.nextInt();
                if(graph[u] == null) {
                    graph[u] = new ArrayList<>();
                }
                graph[u].add(v);
                if(graphTranspose[v] == null) {
                    graphTranspose[v] = new ArrayList<>();
                }
                graphTranspose[v].add(u);
            }
            for (int i = 1; i <= n; i++) {
                if(vis[i] == 0) {
                    dfs(i);
                }
            }

            for (int i = 1; i < vis.length; i++) {
                vis[i] = 0;
            }
            int count = 0;
            for(int i = order.size() - 1; i >= 0;i--) {
                if(vis[order.get(i)] == 0) {
                    scc.clear();
                    System.out.println("First node picked up in current connected component is:" + order.get(i));
                    dfs1(order.get(i));
                    System.out.println(scc);
                    count++;
                }
            }
            System.out.println("There are total " + count + " Connected Component");

            t--;
        }


    }
    public static void dfs(int i) {
        vis[i] = 1;
        for(int u : graph[i]) {
            if(vis[u] == 0) {
                dfs(u);
            }
        }
        order.add(i);
    }

    public static void dfs1(int i) {
        vis[i] = 1;
        for(int u : graphTranspose[i]) {
            if(vis[u] == 0) {
                dfs1(u);
            }
        }
        scc.add(i);
    }
}

/*
INPUT
100
8 12
1 2
2 3
3 1
2 8
3 4
8 4
4 8
7 8
5 4
5 7
7 6
6 5
 */
