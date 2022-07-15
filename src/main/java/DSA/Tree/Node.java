package DSA.Tree;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Node {
    private int val;
    private Node left ;
    private Node right ;
    Node(int i) {
        this.val = i;
    }
}
