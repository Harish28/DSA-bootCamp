package DSA.BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2,3,4,7,9,14,16,18};
        int target = 14;
        System.out.println(binarySearch(arr,target));
    }

    private static int binarySearch(int[] arr, int target) {
        int s = 0;
        int e = arr.length -1;
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
}
