package DSA.Stack;

import java.util.Stack;

public class MinStack {
    private int minEle;
    private Stack<Integer> st = new Stack<>();
    public MinStack() {}

    public void push(int val) {
        if(st.isEmpty()) {
            st.push(val);
            minEle = val;
        }
        else if(val < minEle) {
            st.push(2*val - minEle);
            minEle = val;
        } else {
            st.push(val);
        }
    }

    public void pop() {
        if(st.peek() < minEle) {
            minEle = 2*minEle - st.peek();
        }
        st.pop();
    }

    public int top() {
        if(st.peek() < minEle) {
            return minEle;
        }
        return st.peek();
    }

    public int getMin() {
        return minEle;
    }
}
