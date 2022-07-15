package DSA.Array;

import java.util.Arrays;

public class ShiftZerosToRight {
    public static void main(String[] args) {
//        int [] arr = {0,1,0,3,1,2};
//        //int[] arr = {0,0,0,0,0,0,0};
//        int[] arr = {2,3,45,1,4,5,23};
        int[] arr = {1,0,0,0,1,1,3,4,0,0,0,0,1,1,1};
        shiftZerosToRight(arr);
        Arrays.stream(arr).forEach(i -> System.out.print(i + " "));
    }
    public static void shiftZerosToRight(int[] arr) {
        if(arr == null || arr.length <= 1) {
            return ;
        }
        int j = -1;
        for(int i = 0 ; i < arr.length;i++) {
            if(arr[i] == 0 ) {
                if(j == -1) {
                    j = i + 1;
                }
                while (j < arr.length && arr[j] == 0) {
                    j++;
                }
                if(j == arr.length) {
                    return ;
                }
                int t = arr[j];
                arr[j] = arr[i];
                arr[i] = t;
                j = j+1;
            }
        }
    }
}
