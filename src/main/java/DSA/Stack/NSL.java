package DSA.Stack;

import java.util.Arrays;
import java.util.Stack;

public class NSL {
    public static void main(String[] args) {
        int[] arr = {1,3,4,7,6,2,9,8};
        Stack<Integer> st = new Stack<>();
        int NSL[] = new int[arr.length];
        for (int i = arr.length -1 ; i>= 0 ;i--) {
            if(st.isEmpty() || arr[st.peek()] < arr[i]) {
                st.add(i);
            } else {
                while(!st.isEmpty() && arr[st.peek()] > arr[i]) {
                    NSL[st.pop()] = arr[i];
                }
                st.add(i);
            }
        }
        while (!st.isEmpty()) {
            NSL[st.pop()] = -1;
        }
        Arrays.stream(NSL).forEach(i -> System.out.print(i + " "));
    }
}
