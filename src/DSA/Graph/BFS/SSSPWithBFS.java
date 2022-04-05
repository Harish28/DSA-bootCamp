package DSA.Graph.BFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class SSSPWithBFS {
    public static ArrayList<Integer>[] graph = new ArrayList[8];
    public static int[] dist = new int[8];
    public static int[] vis = new int[8];
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int t = scanner.nextInt();
//        while(t > 0) {
//            int n = scanner.nextInt();;
//            int m = scanner.nextInt();;
//            for(int i = 0; i<m;i++) {
//                int u = scanner.nextInt();;
//                int v = scanner.nextInt();;
//                add(u,v);
//            }
//            t--;
//        }
        add(1,3);
        add(1,2);
        add(3,2);
        add(2,4);
        add(3,5);
        add(5,7);
        add(5,6);
        add(6,7);
        bfs(7,0);
        for(int i = 1;i< dist.length;i++) {
            //System.out.println("dist of " + i + " from 5 is:" + dist[i]);
            System.out.println("dist of " + i + " from 7 is:" + dist[i]);
        }
    }

    public static void bfs(int start,int level) {
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
