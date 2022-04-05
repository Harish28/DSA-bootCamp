package DSA.Stack;

import java.util.Stack;

public class WaterTapping {
    public static int waterTapping(int[] arr) {
        int n = arr.length;
        int water = 0;
        Stack<Integer> st = new Stack<>();
        for(int i = 0 ; i<n;i++) {
            while(!st.isEmpty() && arr[st.peek()] < arr[i]) {
                int tp = st.pop();
                if(st.isEmpty()) {
                    break;
                }
                int width = i - st.peek() - 1;
                water += width*(Math.min(arr[st.peek()],arr[i]) - arr[tp]);
            }
            st.add(i);
        }
        return water;
    }
    public static void main(String[] args) {
        int arr[] = new int[] { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        System.out.println(waterTapping(arr));
    }
}
