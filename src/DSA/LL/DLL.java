package DSA.LL;

public class DLL {
    private Node head;
    private int size;
    DLL() {
        this.size = 0;
    }
    private class Node {
        private int val;
        private Node next;
        private Node prev;
        Node(int val) {
            this.val = val;
        }
    }
    public void insertFront(int val) {
        Node node = new Node(val);
        node.next = head;
        if(head != null) {
            head.prev = node;
        }
        head = node;
        size++;
    }

    public void insertBack(int val) {
        if(head == null) {
            insertFront(val);
            return;
        }
        Node tmp = head;
        while(tmp.next != null) {
            tmp = tmp.next;
        }
        Node node = new Node(val);
        node.prev = tmp;
        tmp.next = node;
        size++;
    }

    public void display() {
        Node node = head;
        while(node != null) {
            System.out.print(node.val + "->");
            node = node.next;
        }
        System.out.println("End");
    }
}
