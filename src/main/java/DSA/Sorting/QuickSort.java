package DSA.Sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {1,2,5,4,3,6,9,8,10,7};
        System.out.println(Arrays.toString(arr));
        quickSort(arr,0,arr.length-1);

        System.out.println("-------- After Sorting ---------");
        System.out.println(Arrays.toString(arr));
    }
    public static void quickSort(int[] arr,int s ,int e) {
        if(s < e) {
            int p = partition(arr,s,e);
            quickSort(arr,s,p-1);
            quickSort(arr,p+1,e);
        }
    }
    public static int partition(int[] arr,int s,int e) {
        int bound = s;//it always points to the next element which we have swap with if we found a smaller element then pivot on ith location
        int pivot = e;
        for(int i = s;i <= e;i++) {
            if(arr[pivot] > arr[i]) {
                int t = arr[i];
                arr[i] = arr[bound];
                arr[bound] = t;
                bound++;
            }
        }
        int t = arr[pivot];
        arr[pivot] = arr[bound];
        arr[bound] = t;
        return bound;
    }
}
