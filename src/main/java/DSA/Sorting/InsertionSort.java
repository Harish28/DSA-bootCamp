package DSA.Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {-1,-7,-9,10,2};
        System.out.println(Arrays.toString(arr));
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void insertionSort(int[] arr) {

        for(int i = 1; i < arr.length;i++) {
            for(int j = i ; j>0;j--) {
                if(arr[j] < arr[j-1]) {
                    int t = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = t;
                } else {
                    break;
                }
            }
        }
    }
}
