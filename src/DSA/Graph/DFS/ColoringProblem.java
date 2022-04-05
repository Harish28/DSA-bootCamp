package DSA.Graph.DFS;

import java.util.ArrayList;

public class ColoringProblem {
    public static ArrayList<Integer>[] graph = new ArrayList[6];
    public static int[] vis = new int[6];
    public static int[] col = new int[6];

//    public static ArrayList<Integer>[] graph = new ArrayList[7];
//    public static int[] vis = new int[7];
//    public static int[] col = new int[7];
    public static void main(String[] args) {
        add(1,2);
        add(2,4);
        add(2,3);
        add(4,5);
        //add(5,6);
        //add(3,6);
        System.out.println(dfs(1,0));

    }
    public static boolean dfs(int s,int c) {
        vis[s] = 1;
        col[s] = c;

        for(int u:graph[s]) {
            if(vis[u] == 0) {
                 if(dfs(u,c^1) == false) {
                     return false;
                 }
            } else if (col[s] == col[u]) {
                return false;
            }
        }
        return true;
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
