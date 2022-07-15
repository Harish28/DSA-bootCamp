package DSA.LL;

public class LL {
    private Node head;
    private Node tail;
    private int size ;
    private class Node {
        int val;
        Node next ;
        Node(int v) {
            this.val = v;
        }
        Node(int v,Node next) {
            this.val = v;
            this.next = next;
        }
    }
    LL() {
        this.size = 0;
    }
    public void insertFront(int v) {
        Node node = new Node(v);
        node.next = head;
        head = node;
        size++;
        if(tail == null) {
            tail = head;
        }
    }

    public void insertBack(int v) {
        Node node = new Node(v);
        if(head == null) {
            insertFront(v);
        } else {
            tail.next = node;
            tail = node;
        }
        size++;
    }

    public void insertRec(int val,int index) {
        head = insertRec(head,val,index);
    }
    public Node insertRec(Node tmp,int val,int index) {
        if(index == 0) {
            Node node = new Node(val);
            node.next = tmp;
            size++;
            return node;
        }
        tmp.next = insertRec(tmp.next,val,index-1);
        return tmp;
    }

    public void display() {
        Node node = head;
        while(node != null) {
            System.out.print(node.val + "->");
            node = node.next;
        }
        System.out.println("End");
    }
    public void insertAtK(int v,int K) {
        if(K > size || K < 0) {
            return;
        }
        Node tmp = head;
        if(K == 0) {
            insertFront(v);
            return ;
        } else if(K == size) {
            insertBack(v);
            return;
        }
        Node node = new Node(v);
        while(K != 1) {
            tmp = tmp.next;
            K--;
        }
        Node t = tmp.next;
        tmp.next = node;
        node.next = t;
        size++;
    }

    public int deleteFront() {
        int v = head.val;
        head = head.next;
        return v;
    }

    public int delete(int index) {
        if(size == 0 || index > size || index < 0) {
            return -1;
        }
        if(index == 0) {
            return deleteFront();
        } else {
            Node tmp = head;
            while (index > 1) {
                index--;
                tmp = tmp.next;
            }
            int v = tmp.next.val;
            tmp.next = tmp.next.next;
            return v;
        }
    }

}
