package DSA.BinarySearch;

public class FindMinInRotatedArray {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,1,2};
        System.out.println(findMin(nums));
    }
    public static int findMin(int[] nums) {
        int s = 0;
        int e = nums.length -1;
        while(s < e) {
            int mid = s + (e-s)/2;
            if(nums[mid] > nums[mid+1]) {
                return nums[mid+1];
            } else if(nums[mid] < nums[mid-1]) {
                return nums[mid];
            } else if (nums[mid] < nums[s]) {
                e = mid-1;
            } else {
                s = mid +1 ;
            }
        }
        return nums[0];
    }
}
