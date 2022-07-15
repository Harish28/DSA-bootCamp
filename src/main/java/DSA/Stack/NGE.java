package DSA.Stack;

import java.util.Scanner;
import java.util.Stack;

public class NGE {
    public static void main(String[] args) {
        int[] arr = {1,3,4,7,6,2,5,9,8};
        Stack<Integer> st = new Stack<>();
        for (int i : arr) {
            if(st.isEmpty() || st.peek() > i) {
                st.add(i);
            } else {
                while(!st.isEmpty() && st.peek() < i) {
                    System.out.println("NGE of " + st.pop() + " is " + i);
                }
                st.add(i);
            }
        }
        while (!st.isEmpty()) {
            System.out.println("NGE of "+ st.pop() + " is -1");
        }


    }
}
