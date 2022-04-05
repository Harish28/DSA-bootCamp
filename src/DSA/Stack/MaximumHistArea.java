package DSA.Stack;

import java.util.Stack;

public class MaximumHistArea {
    public static long getMaxArea(long hist[], long n)
    {
        long area = Integer.MIN_VALUE;
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i<hist.length;i++) {
            if(st.isEmpty() || hist[i] >= hist[st.peek()]) {
                st.add(i);
            } else {
                while (!st.isEmpty() && hist[i] < hist[st.peek()]) {
                    int j = st.pop();
                    area = Math.max(area,(hist[j]*(st.isEmpty() ? i : i - st.peek() - 1)));

                }
                st.add(i);
            }
        }

        while(!st.isEmpty()) {
            int top = st.pop();
            area = Math.max(area,hist[top]*(st.isEmpty() ? n : n - st.peek() - 1));
        }
        return area;
    }
    public static void main(String[] args) {
        long[] hist = {6,2,5,4,5,1,6};
        System.out.println(getMaxArea(hist,hist.length));
    }
}
