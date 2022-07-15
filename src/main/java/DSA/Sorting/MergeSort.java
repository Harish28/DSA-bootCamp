package DSA.Sorting;

import java.sql.SQLOutput;
import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {2,1,3,6,4,8,9};
        mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void mergeArray(int[] arr,int s,int mid ,int e) {
        int[] sortedArray = new int[e - s + 1];
        int i = s;
        int j = mid+1;
        int k = 0;
        while(i <=mid && j <= e) {
            if (arr[i] <= arr[j]) {
                sortedArray[k++] = arr[i++];
            } else {
                sortedArray[k++] = arr[j++];
            }
        }
        while(i <= mid) {
            sortedArray[k++] = arr[i++];
        }
        while(j <= e) {
            sortedArray[k++] = arr[j++];
        }

        for(int p = 0;p< sortedArray.length;p++) {
            arr[s+p] = sortedArray[p];
        }
    }
    public static void mergeSort(int[] arr,int s,int e) {
        if(s == e) {
            return ;
        }
        int mid = s + (e-s)/2;
        mergeSort(arr,s,mid);
        mergeSort(arr,mid+1 ,e);
        mergeArray(arr,s,mid,e);
    }
}
