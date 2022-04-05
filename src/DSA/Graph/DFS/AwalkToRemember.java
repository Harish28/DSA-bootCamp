package DSA.Graph.DFS;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//https://www.hackerearth.com/practice/algorithms/graphs/strongly-connected-components/practice-problems/algorithm/a-walk-to-remember-qualifier2/
public class AwalkToRemember {
    private static int[] vis = new int[100001];
    private static int[] isGood = new int[100001];
    private static List<Integer> order = new ArrayList<>();
    private static ArrayList<Integer>[] graph = new ArrayList[100001];
    private static ArrayList<Integer>[] graphTranspose = new ArrayList[100001];
    private static ArrayList<Integer> scc = new ArrayList<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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
            for(int i = order.size() - 1; i >= 0;i--) {
                if(vis[order.get(i)] == 0) {
                    scc.clear();
                    dfs1(order.get(i));
                    if(scc.size() >= 2) {
                        for(int u : scc) {
                            isGood[u] = 1;
                        }
                    } else {
                        isGood[scc.get(0)] = 0;
                    }
                }
            }
            for(int i = 1; i<=n;i++) {
                System.out.print(isGood[i] + " ");
            }
    }
    public static void dfs(int i) {
        vis[i] = 1;
        if(graph[i] != null) {
            for(int u : graph[i]) {
                if(vis[u] == 0) {
                    dfs(u);
                }
            }
        }
        order.add(i);
    }

    public static void dfs1(int i) {
        vis[i] = 1;
        if(graphTranspose[i] != null) {
            for(int u : graphTranspose[i]) {
                if(vis[u] == 0) {
                    dfs1(u);
                }
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
