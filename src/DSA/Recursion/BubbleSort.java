package DSA.Recursion;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1,2,4,3,5,6};
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr, arr.length-1, 0);
        System.out.println(Arrays.toString(arr));
    }
    public static void bubbleSort(int arr[],int r,int c) {
        if(r == 0) {
            return ;
        }
        if(r == c) {
            bubbleSort(arr,r-1,0);
        } else {
            if(arr[c] > arr[c+1]) {
             int a = arr[c];
             arr[c] = arr[c+1];
             arr[c+1] = a;
            }
            bubbleSort(arr,r,c+1);
        }
    }
}
