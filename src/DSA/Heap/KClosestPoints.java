package DSA.Heap;

import javafx.util.Pair;

import java.util.Comparator;
import java.util.PriorityQueue;
class PointComp implements Comparator<Pair<Integer, Pair<Integer, Integer>>> {

    @Override
    public int compare(Pair<Integer, Pair<Integer, Integer>> o1, Pair<Integer, Pair<Integer, Integer>> o2) {
        return -o1.getKey().compareTo(o2.getKey());
    }
}
public class KClosestPoints {
    public static void main(String[] args) {
        int[][] d = {{3,3},{5,-1},{-2,4}};
        int[][] res = kClosest(d,2);
        for(int i = 0 ; i < 2;i++) {
            System.out.println("x = " + res[i][0] + " y = " + res[i][1]);
        }
    }
    public static int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Pair<Integer,Pair<Integer,Integer>>> pq = new PriorityQueue<>(new PointComp());
        int[][] res = new int[k][2];
        for(int i = 0 ; i< points.length;i++) {
            int dist = (points[i][0]*points[i][0] + points[i][1]*points[i][1]);
            pq.add(new Pair<> (dist,new Pair<>(points[i][0],points[i][1])));
            if(pq.size() > k) {
                pq.poll();
            }
        }
        int count = 0;
        while (!pq.isEmpty()) {
            res[count][0] = pq.peek().getValue().getKey();
            res[count++][1] = pq.poll().getValue().getValue();
        }
        return res;
    }
}
