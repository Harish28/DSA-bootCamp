package DSA.BinarySearch;

public class SearchInMountain {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,8,7,6,5,4,3,2};
        //System.out.println(findInMountainArray(7,arr));
    }
    /*public static int findInMountainArray(int target, int[] arr) {
        int peak = peakIndexInMountainArray(arr);

    }*/

    private static int binarySearch(int[] arr, int target,int s ,int e) {
        while(s <= e) {
            int mid = s + (e-s)/2;
            if (arr[mid] == target) {
                return mid;
            } else if(arr[mid] > target) {
                e = mid-1;
            } else {
                s = mid+1;
            }
        }
        return -1;
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
