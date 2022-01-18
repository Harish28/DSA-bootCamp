package DSA.Sorting;

public class FirstPositiveMissingNumber {
    //https://leetcode.com/problems/first-missing-positive/
    public static void main(String[] args) {

    }

    public static int firstMissingPositive(int[] nums) {
        cyclicSort(nums);
        int i = 1;
        for( ;i<nums.length;i++) {
            if(nums[i] != i) {
                return i+1;
            }
        }
        return nums.length + 1;
    }

    public static void cyclicSort(int[] arr) {
        int i = 0;
        int n = arr.length;
        while(i < arr.length) {
            if(arr[i] != i+1) {
                if(arr[i] < n && arr[i] > 0 && arr[arr[i] -1] != arr[i]) {
                    int t = arr[arr[i] -1];
                    arr[arr[i] -1] = arr[i];
                    arr[i] = t;
                } else {
                    i++;
                }

            } else {
                i++;
            }
        }
    }
}
