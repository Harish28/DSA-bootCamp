package DSA.Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        System.out.println(Arrays.toString(arr));
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static int maxIndex(int[] arr,int last) {
        int index = 0;
        for(int i = 1 ; i<=last;i++) {
            if (arr[i] > arr[index]) {
                index = i;
            }
        }
        return index;
    }
    public static void selectionSort(int[] arr) {
        for(int i = 0; i<arr.length ; i++) {
            int last = arr.length - i -1;
            int maxIndex = maxIndex(arr,last);
            int t = arr[last];
            arr[last] = arr[maxIndex];
            arr[maxIndex] = t;
        }
    }
}
