package DSA.BinarySearch;

public class Celling {
    public static void main(String[] args) {
        int[] arr = {2,3,4,7,9,14,16,18};
        int target = 19;
        System.out.println(celling(arr,target));
    }

    private static int celling(int[] arr, int target) {
        if(target > arr[arr.length -1]) {
            return -1;
        }
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
        return s;
    }
}
