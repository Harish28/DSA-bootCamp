package DSA.Tree;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    public static void preOrder(Node root) {
        if(root == null) {
            return ;
        }
        System.out.print(root.getVal() + " ");
        preOrder(root.getLeft());
        preOrder(root.getRight());
    }

    public static void preOrderIterative(Node root) {
        Deque<Node> deque = new ArrayDeque<>();
        deque.push(root);
        while(!deque.isEmpty()) {
            Node node = deque.pop();
            System.out.print(node.getVal() + " ");
            if(node.getRight() != null) {
                deque.push(node.getRight());
            }
            if(node.getLeft() != null) {
                deque.push(node.getLeft());
            }
        }
    }

    public static void inOrderIterative(Node root) {
        Deque<Node> deque = new ArrayDeque<>();
        Node tmp = root;
        while(true) {
            if(tmp != null) {
                deque.push(tmp);
                tmp = tmp.getLeft();
            } else {
                if(deque.isEmpty()) {
                    return ;
                }
                tmp = deque.pop();
                System.out.print(tmp.getVal() + " ");
                tmp = tmp.getRight();
            }
        }
    }

    public static void inOrder(Node root) {
        if(root == null) {
            return ;
        }
        inOrder(root.getLeft());
        System.out.print(root.getVal() + " ");
        inOrder(root.getRight());
    }

    public static void postOrder(Node root) {
        if(root == null) {
            return;
        }
        postOrder(root.getLeft());
        postOrder(root.getRight());
        System.out.print(root.getVal() + " ");
    }
    public static void postOrderIterative(Node root) {
        Deque<Node> st1 = new ArrayDeque<>();
        Deque<Node> st2 = new ArrayDeque<>();
        st1.push(root);
        while(!st1.isEmpty()) {
            Node node = st1.pop();
            st2.push(node);
            if(node.getLeft() != null) {
                st1.push(node.getLeft());
            }
            if(node.getRight() != null) {
                st1.push(node.getRight());
            }
        }
        st2.stream().forEach(i -> System.out.print(i.getVal() + " "));
    }
    public static void BFS(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()) {
            int size = queue.size();
            while(size > 0) {
                size--;
                Node node = queue.poll();
                System.out.print(node.getVal() + " ");
                if(node.getLeft() != null) {
                    queue.add(node.getLeft());
                }
                if(node.getRight() != null) {
                    queue.add(node.getRight());
                }
            }
        }
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        Node n1 = new Node(2);
        Node n2 = new Node(3);
        Node n3 = new Node(4);
        Node n4 = new Node(5);
        Node n5 = new Node(6);
        Node n6 = new Node(7);
        root.setLeft(n1);
        root.setRight(n2);
        n1.setLeft(n3);
        n1.setRight(n4);
        n2.setLeft(n5);
        n2.setRight(n6);
        System.out.println("---Pre order---");
        preOrder(root);
        System.out.println();
        System.out.println("---Pre order Iterative---");
        preOrderIterative(root);
        System.out.println();
        System.out.println("---In order---");
        inOrder(root);
        System.out.println();
        System.out.println("---In order Iterative ---");
        inOrderIterative(root);
        System.out.println();
        System.out.println("---Post order---");
        postOrder(root);
        System.out.println();
        System.out.println("---Post order Iterative---");
        postOrderIterative(root);
        System.out.println();
        System.out.println("---BFS order---");
        BFS(root);
    }
}
