package DSA.Graph.DFS;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RoundTrip {
    private static int[] vis = new int[100001];
    private static ArrayList<Integer>[] graph = new ArrayList[100001];
    private static ArrayList<Integer> trip= new ArrayList<>();
    private static boolean cycleFound = false;
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

            if(graph[v] == null) {
                graph[v] = new ArrayList<>();
            }
            graph[v].add(u);
        }
        for (int i = 1; i <= n; i++) {
            if(vis[i] == 0) {
                if(dfs(i,-1) == true) {
                    List<Integer> l = new ArrayList<>();
                    cycleFound = true;
                    int count = 1;
                    int last = trip.get(trip.size() -1);
                    l.add(last);
                    for (int j = trip.size() -2 ; j >= 0; j--) {
                        l.add(trip.get(j));
                        if(trip.get(j) != last) {
                            count++;
                        } else {
                            count++;
                            break;
                        }
                    }
                    System.out.println(count);
                    l.stream().forEach(k -> System.out.print(k + " "));
                    break;
                }
            }
        }

        if(cycleFound == false) {
            System.out.println("IMPOSSIBLE");
        }
    }
    public static boolean dfs(int i,int p) {
        vis[i] = 1;
        trip.add(i);
        if(graph[i] != null) {
            for(int u : graph[i]) {
                if(vis[u] == 0) {
                    if (dfs(u,i) == true) {
                        return true;
                    }
                } else if(u != p){
                    trip.add(u);
                    return true;
                }
            }
        }
        return false;
    }
}
