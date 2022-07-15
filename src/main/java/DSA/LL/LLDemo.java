package DSA.LL;

import java.util.Iterator;
import java.util.LinkedList;

public class LLDemo {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(20);
        ll.addFirst(30);
        ll.addLast(40);
        ll.addFirst(50);
        ll.addFirst(60);
        ll.addLast(70);
        ll.addLast(90);
        Iterator<Integer> it = ll.iterator();
        while (it.hasNext()) {
            System.out.print((Integer) it.next() + "-->");
        }
        System.out.println("END");
    }


}
