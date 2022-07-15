package DSA.Recursion;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        System.out.println(Arrays.toString(arr));
        selectionSort(arr,arr.length-1);
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
    public static void selectionSort(int[] arr,int r) {
        if(r == 0) {
            return;
        }
        int maxIdx = maxIndex(arr,r);
        int t = arr[r];
        arr[r] = arr[maxIdx];
        arr[maxIdx] = t;
        selectionSort(arr,r-1);
    }
}
