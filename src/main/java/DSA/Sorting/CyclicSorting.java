package DSA.Sorting;

import java.util.Arrays;

public class CyclicSorting {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,4};
        System.out.println(Arrays.toString(arr));
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void cyclicSort(int[] arr) {
        int i = 0;
        while(i < arr.length) {
            if(arr[i] != i+1) {
                int t = arr[arr[i] -1];
                arr[arr[i] -1] = arr[i];
                arr[i] = t;
            } else {
                i++;
            }
        }
    }
}
