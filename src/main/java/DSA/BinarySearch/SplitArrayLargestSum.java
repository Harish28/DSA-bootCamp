package DSA.BinarySearch;

import java.util.stream.IntStream;

public class SplitArrayLargestSum {
    public static void main(String[] args) {
        int[] nums = {7,2,5,8,10};
        System.out.println(splitArray(nums,2));
    }
    public  static int splitArray(int[] nums, int m) {
        int end = IntStream.of(nums).sum();
        int start = IntStream.of(nums).max().getAsInt();
        while(start < end) {
            int mid = start + (end - start)/2;
            int count = 1;
            int sum = 0;
            for (int i = 0; i<nums.length;i++) {
                if(sum+nums[i] <= mid) {
                    sum += nums[i];
                } else {
                    count++;
                    sum = nums[i];
                }
            }
            if(count <= m) {
                end = mid;
            } else {
                start = mid+1;
            }
        }
        return end;
    }

}
