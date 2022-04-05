package DSA.BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {{10,20,30,40},{15,25,35,45},{28,29,37,49},{33,34,38,50}};
        int ele;
        Scanner scanner = new Scanner(System.in);
        while(true) {
            ele = scanner.nextInt();
            if(ele < 0) {
                break;
            }
            System.out.println(Arrays.toString(searchIn2D(arr,ele)));
        }
    }
    public static int[] searchIn2D(int[][] arr,int target) {
        int l = 0;
        int u = arr.length - 1;
        while (l < arr.length && u >= 0) {
            if(arr[l][u] == target) {
                return new int[]{l,u};
            }
            if(arr[l][u] > target) {
                u--;
            } else {
                l++;
            }
        }
        return new int[0];
    }

}
