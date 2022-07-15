package DSA.Graph.SSSP;

import javafx.util.Pair;

import java.util.*;

class Comp implements Comparator<Pair<Integer,Integer>> {

    @Override
    public int compare(Pair<Integer, Integer> o1, Pair<Integer, Integer> o2) {
        return o1.getKey().compareTo(o2.getKey());
    }
}

/*
6 9
1 2 4
1 6 2
2 6 1
2 3 5
3 6 8
6 5 10
3 5 3
3 4 6
5 4 5

Output
Current node is :1
Current node is :6
Current node is :2
Current node is :2
Current node is :3
Current node is :3
Current node is :5
Current node is :5
Current node is :4
Distance of 1 from 1 is: 0
Distance of 2 from 1 is: 3
Distance of 3 from 1 is: 8
Distance of 4 from 1 is: 14
Distance of 5 from 1 is: 11
Distance of 6 from 1 is: 2
 */
public class DijsktraAlgoForSSSP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int e = scanner.nextInt();
        ArrayList<Pair<Integer,Integer>>[] graph = new ArrayList[n+1];
        int[] distance = new int[n+1];
        for (int i = 0; i < distance.length; i++) {
            distance[i] = Integer.MAX_VALUE;
        }
        while(e > 0) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            int w = scanner.nextInt();
            if(graph[u] == null) {
                graph[u] = new ArrayList<>();
            }
            graph[u].add(new Pair<>(v,w));
            if(graph[v] == null) {
                graph[v] = new ArrayList<>();
            }
            graph[v].add(new Pair<>(u,w));
            e--;
        }
        DijsktraAlgo(graph,distance,1);
        for (int i = 1; i < n+1; i++) {
            System.out.println("Distance of " + i  + " from 1 is: " + distance[i]);
        }
    }

    private static void DijsktraAlgo(ArrayList<Pair<Integer,Integer>>[] graph,int[] distance,int src) {
        PriorityQueue<Pair<Integer,Integer>> pq = new PriorityQueue<>(new Comp());
        distance[src] = 0;
        pq.add(new Pair<>(distance[src],src));
        while(!pq.isEmpty()) {
            Pair<Integer,Integer> cur = pq.poll();
            System.out.println("Current node is :" + cur.getValue());
            for(Pair<Integer,Integer> u : graph[cur.getValue()]) {
                int node = u.getKey();
                int weight = u.getValue();
                if(distance[node] > distance[cur.getValue()] + weight) {
                    distance[node] = Math.min(distance[node], distance[cur.getValue()] + weight);
                    pq.add(new Pair<>(distance[node],node));
                }

            }
        }
    }
}
