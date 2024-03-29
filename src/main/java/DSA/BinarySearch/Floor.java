package DSA.BinarySearch;

public class Floor {
    public static void main(String[] args) {
        int[] arr = {2,3,4,7,9,14,16,18};
        int target = 1;
        System.out.println(floor(arr,target));
    }

    private static int floor(int[] arr, int target) {
        if(target < arr[0]) {
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
        return e;
    }
}
