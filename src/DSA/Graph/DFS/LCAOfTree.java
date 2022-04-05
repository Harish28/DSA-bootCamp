package DSA.Graph.DFS;

import java.util.ArrayList;
import java.util.Scanner;

public class LCAOfTree {
    public static ArrayList<Integer>[] graph = new ArrayList[1001];
    public static int[] level = new int[1001];
    public static int[][] parent = new int[1001][(int)Math.log(1001)];
    private static int n ;
    private static int e ;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        e = scanner.nextInt();
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
        init();
        System.out.println("Enter no of query");
        int t = scanner.nextInt();
        while(t > 0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println("LCA of " + a + "," + b +  " is: " + lca(a,b));
            t--;
        }
    }
    public static void dfs(int node , int par,int lvl) {
        level[node] = lvl;
        parent[node][0] = par;
        for(int u : graph[node]) {
            if(u != par) {
                dfs(u,node,lvl + 1);
            }
        }
    }

    public static void init() {
        dfs(1,-1,0);
        for(int j = 1; j <= Math.log(n);j++) {
            for(int i = 1; i <= n;i++) {
                if(parent[i][j-1] != -1) {
                    int p = parent[i][j-1];
                    parent[i][j] = parent[p][j-1];
                }
            }
        }
    }

    public static int lca(int a ,int b) {
        if(level[a] > level[b]) {
            int t = b;
            b = a;
            a = t;
        }
        int d = level[b] - level[a];
        while (d > 0) {
            int i = (int) Math.log(d);
            b = parent[b][i];
            d -= 1 << i;
        }
        if(a == b) {
            return a;
        }
        for(int i = (int) Math.log(n); i>=0;i--) {
            if(parent[a][i] != -1 && parent[a][i] != parent[b][i]) {
                a = parent[a][i];
                b = parent[b][i];
            }
        }
        return parent[a][0];
    }
}
