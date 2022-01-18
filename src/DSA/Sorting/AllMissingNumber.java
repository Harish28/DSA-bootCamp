package DSA.Sorting;

import java.util.ArrayList;
import java.util.List;

public class AllMissingNumber {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(missingNumber(arr));
    }
    public static List<Integer> missingNumber(int[] nums) {
        cyclicSort(nums);
        List<Integer> res = new ArrayList<>();
        int i = 0;
        for( ;i<nums.length;i++) {
            if (nums[i] != i+1) {
                res.add(i+1);
            }
        }
        if(res.isEmpty()) {
            res.add(nums.length);
        }
        return res;
    }

    public static void cyclicSort(int[] arr) {
        int i = 0;
        while(i < arr.length) {
            if(arr[i] != i+1) {
                if(arr[arr[i] -1] != arr[i]) {
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

