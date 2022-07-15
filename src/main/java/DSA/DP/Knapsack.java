package DSA.DP;

public class Knapsack {
    public static void main(String[] args) {
        int[] val = {1,4,5,7};
        int[] w = {1,3,4,5};
        int W = 7;
        System.out.println(knapsackRecursive(val,w,W,0));
    }
    public static int knapsackRecursive(int[] val, int[] w, int W, int index) {
        if(index >= w.length) {
            return 0;
        }
        if(W >= w[index]) {
            return Math.max(val[index] + knapsackRecursive(val, w, W-w[index], index + 1), knapsackRecursive(val, w, W, index + 1));
        } else {
            return knapsackRecursive(val, w, W, index + 1);
        }

    }
}
