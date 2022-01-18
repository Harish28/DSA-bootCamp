package DSA.BinarySearch;

public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {2,3,5,7,11,15,17,23,25,26,67,98,112,11321,32412,43252};
        System.out.println(getIndex(arr,98));
    }
    public static int getIndex(int[]arr,int target) {
        int start = 0,end = 1;
        while(target > arr[end]) {
            int newStart = end+1;
            end = end + (end-start+1)*2;
            start = newStart;
        }
        return binarySearch(arr,target,start,end);
    }

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
}
