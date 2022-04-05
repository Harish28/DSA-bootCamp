package DSA.Graph.DFS;

import java.util.ArrayList;
import java.util.Scanner;

//https://www.spoj.com/problems/BUGLIFE/
public class BugsLifeProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t ,n,m,u,v;
        t = scanner.nextInt();
        while(t > 0) {
            t--;
            n = scanner.nextInt();
            m = scanner.nextInt();
            ArrayList<Integer>[] graph = new ArrayList[n + 1];
            int[] vis = new int[n + 1];
            int[] col = new int[n + 1];
            for(int i = 0; i < m;i++) {
                u = scanner.nextInt();
                v = scanner.nextInt();
                add(u,v,graph);
            }
            if(dfs(1,0,graph,vis,col)) {
                System.out.println("No suspicious bugs found!");
            } else {
                System.out.println("Suspicious bugs found!");
            }
        }
    }
    public static boolean dfs(int s,int c,ArrayList<Integer>[] graph,int[] vis,int[] col) {
        vis[s] = 1;
        col[s] = c;

        for(int u:graph[s]) {
            if(vis[u] == 0) {
                if(dfs(u,c^1,graph,vis,col) == false) {
                    return false;
                }
            } else if (col[s] == col[u]) {
                return false;
            }
        }
        return true;
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
