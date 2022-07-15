package DSA.Sorting;

public class MinimalKEleAdd {
    public static void cyclicSort(int[] arr) {
        int i = 0;
        while(i < arr.length) {
            if(arr[i] < arr.length && arr[i] != arr[arr[i] - 1] && arr[i] != i+1) {
                int t = arr[arr[i] -1];
                arr[arr[i] -1] = arr[i];
                arr[i] = t;
            } else {
                i++;
            }
        }
    }
    public static long minimalKSum(int[] nums, int k) {
        cyclicSort(nums);
        int count = k,i,res = 0;
        for(i = 0; i< nums.length;i++) {
            if(nums[i] != i + 1) {
                res+= i + 1;
                count--;
                if(count == 0) {
                    return res;
                }
            }

        }
        i = i + 1;
        while(count > 0) {
            res += i++;
            count--;
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {5,6};
        minimalKSum(arr,6);
    }
}
