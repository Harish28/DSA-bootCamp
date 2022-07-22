package DSA.BinarySearch;
//https://leetcode.com/problems/peak-index-in-a-mountain-array/
public class PeakIndex {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,8,7,6,5,4,3,2};
        System.out.println(peakIndexInMountainArray(arr));
    }
    public static int peakIndexInMountainArray(int[] arr) {
        int s = 0;
        int e = arr.length-1;
        while(s < e) {
            int mid = s + (e-s)/2;
            if(arr[mid] < arr[mid+1]) {
                s = mid+1;
            } else {
                e = mid;
            }
        }
        return s;
    }
}
