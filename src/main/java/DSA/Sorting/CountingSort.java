package DSA.Sorting;

import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args) {

    }

    public int[] sortArray(int[] nums) {
        int max = Arrays.stream(nums).max().getAsInt();
        int min = Arrays.stream(nums).min().getAsInt();
        int range = max - min + 1;
        int[] count = new int[range];
        int[] output = new int[nums.length];
        for(int i : nums) {
            count[i-min]++;
        }
        for(int i = 1 ; i< count.length;i++) {
            count[i] += count[i-1];
        }
        for(int i = nums.length - 1; i >= 0;i--) {
            output[count[nums[i] - min] - 1] = nums[i];
            count[nums[i] - min]--;
        }
        return output;
    }
}
