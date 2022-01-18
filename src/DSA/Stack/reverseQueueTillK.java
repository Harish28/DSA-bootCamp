package DSA.Stack;

import sun.awt.image.ImageWatched;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class reverseQueueTillK {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(4);
        q.add(3);
        q.add(1);
        q.add(2);
        q.add(5);
        q.add(6);
        modifyQueue(q,4);
        System.out.println(q);
    }

    public static Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
        // add code here.
        Stack<Integer> st = new Stack<>();
        int count = k;
        while(count != 0) {
            st.push(q.poll());
            count--;
        }
        while(!st.isEmpty()) {
            q.add(st.pop());
        }
        count = q.size() - k;
        while(count != 0) {
            q.add(q.poll());
            count--;
        }
        return q;
    }
}
