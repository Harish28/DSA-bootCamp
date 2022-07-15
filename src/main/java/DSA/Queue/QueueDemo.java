package DSA.Queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);
        queue.offer(50);
        queue.offer(60);
        for(int i : queue) {
            System.out.print(i + " ");
        }
        System.out.println(queue.peek());
        queue.poll();
        queue.poll();
        System.out.println(queue.peek());
        queue.offer(70);
        queue.poll();
        System.out.println(queue.peek());
    }
}
