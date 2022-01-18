package DSA.Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void bubbleSort(int[] arr) {
        for (int i = 0;i<arr.length-1;i++) {
            boolean isSwapOccur = false;
            for(int j = 1; j < arr.length - i;j++) {
                if (arr[j] < arr[j-1]) {
                    isSwapOccur = true;
                    int t = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = t;
                }
            }
            if(!isSwapOccur) {
                break;
            }
        }
    }
}
