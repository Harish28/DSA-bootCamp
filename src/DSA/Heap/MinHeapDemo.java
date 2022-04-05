package DSA.Heap;
import javafx.util.Pair;

import java.util.Comparator;
import java.util.PriorityQueue;
class comp implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return -o1.compareTo(o2);
    }
}

class comp2 implements Comparator<Pair<Integer,Integer>> {


    @Override
    public int compare(Pair<Integer, Integer> o1, Pair<Integer, Integer> o2) {
        return o1.getKey().compareTo(o2.getKey());
    }
}
public class MinHeapDemo {
    public static void main(String[] args) {
        //MIn heap
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(7);
        pq.add(3);
        pq.add(4);
        pq.add(2);
        pq.add(1);
        pq.add(5);
        pq.add(6);
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
        System.out.println("----------------------------------------------------");
        //Max heap
        PriorityQueue<Integer> pq1 = new PriorityQueue<>(new comp());
        pq1.add(7);
        pq1.add(3);
        pq1.add(4);
        pq1.add(2);
        pq1.add(1);
        pq1.add(5);
        pq1.add(6);
        while (!pq1.isEmpty()) {
            System.out.println(pq1.poll());
        }
        System.out.println("---------------------------------");
        // min heap with pair
        PriorityQueue<Pair<Integer,Integer>> pq2 = new PriorityQueue<>(new comp2());
        pq2.add(new Pair<>(5,-1));
        pq2.add(new Pair<>(6,-2));
        pq2.add(new Pair<>(2,3));
        pq2.add(new Pair<>(1,5));
        pq2.add(new Pair<>(3,7));
        pq2.add(new Pair<>(4,9));

        while (!pq2.isEmpty()) {
            System.out.println(pq2.poll());
        }
    }
}
