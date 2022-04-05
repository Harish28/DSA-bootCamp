package DSA.BinarySearch;

import java.util.HashMap;

public class PeakInRotatedArray {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,8,1,2};
        System.out.println(peakEle(arr));
    }
    public static int peakEle(int[] arr) {
        int s = 0;
        int e = arr.length -1;
        while(s <= e) {
            int mid = s + (e -s)/2;
            if((mid > 0 && arr[mid] > arr[mid-1]) && (mid < arr.length -1 && arr[mid] > arr[mid+1])) {
                return mid;
            } else if((mid > 0 && arr[mid] < arr[mid-1]) && (mid < arr.length -1 && arr[mid] < arr[mid+1])) {
                return mid-1;
            } else if(arr[mid] < arr[0]){
                e = mid -1 ;
            } else {
                s = mid+1;
            }
        }
        return -1;
    }
}
