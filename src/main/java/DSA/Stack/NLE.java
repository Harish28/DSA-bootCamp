package DSA.Stack;

import java.util.Stack;

public class NLE {
    public static void main(String[] args) {
        int[] arr = {1,3,4,7,6,2,1,9,8};
        Stack<Integer> st = new Stack<>();
        for (int i : arr) {
            if(st.isEmpty() || st.peek() < i) {
                st.add(i);
            } else {
                while(!st.isEmpty() && st.peek() > i) {
                    System.out.println("NLE of " + st.pop() + " is " + i);
                }
                st.add(i);
            }
        }
        while (!st.isEmpty()) {
            System.out.println("NLE of "+ st.pop() + " is -1");
        }
    }
}
