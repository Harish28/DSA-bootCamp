package DSA.Graph.Tolology;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class KahnsAlgorithmForTopologicalSorting {
    public static ArrayList<Integer>[] graph = new ArrayList[10];
    public static int[] in = new int[10];
    public static ArrayList<Integer> topologicalSort = new ArrayList<>();
    public static void kahnsAlgo(int n) {
        Queue<Integer> q = new LinkedList<>();
        for(int i = 1; i<=n;i++) {
            if(in[i] == 0) {
                q.add(i);
            }
        }
        while (!q.isEmpty()) {
            int curr = q.poll();
            if(graph[curr] != null) {
                for(int u: graph[curr]) {
                    in[u]--;
                    if(in[u] == 0) {
                        q.add(u);
                    }
                }
            }
            topologicalSort.add(curr);
        }

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        for(int i = 0; i< m;i++) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            if(graph[u] == null) {
                graph[u] = new ArrayList<>();
            }
            graph[u].add(v);
            in[v]++;
        }
        kahnsAlgo(n);
        System.out.println(topologicalSort);
    }
}
