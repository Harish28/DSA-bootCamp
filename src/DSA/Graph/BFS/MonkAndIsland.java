package DSA.Graph.BFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//https://www.hackerearth.com/practice/algorithms/graphs/breadth-first-search/practice-problems/algorithm/monk-and-the-islands/
public class MonkAndIsland {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t > 0) {
            int n = scanner.nextInt();;
            ArrayList<Integer>[] graph = new ArrayList[n+1];
            int[] dist = new int[n+1];
            int[] vis = new int[n+1];
            int m = scanner.nextInt();;
            for(int i = 0; i<m;i++) {
                int u = scanner.nextInt();;
                int v = scanner.nextInt();;
                add(u,v,graph);
            }
            bfs(1,0,graph,vis,dist);
            System.out.println(dist[n]);
            t--;
        }

    }

    public static void bfs(int start,int level,ArrayList<Integer>[] graph,int[] vis,int[] dist) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        vis[start] = 1;
        dist[start] = level;
        while (!queue.isEmpty()) {
            int count = queue.size();
            while(count > 0) {
                int cur = queue.poll();
                for(int u : graph[cur]) {
                    if(vis[u] == 0) {
                        vis[u] = 1;
                        dist[u] = level + 1;
                        queue.add(u);
                    }
                }
                count--;
            }
            level++;
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
