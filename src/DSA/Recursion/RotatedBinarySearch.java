package DSA.Recursion;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {5,6,7,1,2,3,4};
        System.out.println(RBS(arr,9,0,arr.length-1));
    }
    public static int RBS(int[] arr,int target,int s ,int e) {
        if(s > e) {
            return -1;
        }
        int mid = s + (e-s)/2;
        if(arr[mid] == target) {
            return mid;
        }
        if(arr[s] <= arr[mid]) {
            if(arr[s] <= target && arr[mid] > target) {
                return RBS(arr,target,s,mid-1);
            } else {
                return RBS(arr,target,mid+1,e);
            }
        } else if(target > arr[mid] && target <= arr[e]) {
            return RBS(arr,target,mid+1,e);
        } else {
            return RBS(arr,target,s,mid-1);
        }

    }
}
