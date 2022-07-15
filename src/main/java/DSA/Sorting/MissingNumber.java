package DSA.Sorting;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {0,1};
        System.out.println(missingNumber(arr));
    }
    public static int missingNumber(int[] nums) {
        cyclicSort(nums);
        int i = 0;
        for( ;i<nums.length;i++) {
            if(nums[i] != i) {
                return i;
            }
        }
        return i;
    }
    public static void cyclicSort(int[] arr) {
        int i = 0;
        while(i < arr.length) {
            if(arr[i] == arr.length) {
                i++;
                continue;
            }
            if(arr[i] != i) {
                int t = arr[arr[i]];
                arr[arr[i]] = arr[i];
                arr[i] = t;
            } else {
                i++;
            }
        }
    }

}
