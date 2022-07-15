package DSA.BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchIn2D {
    public static void main(String[] args) {
        //int[][] arr= {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        //int[][] arr = {{1},{3}};
        int[][] arr= {{1,3,5,7}};
        int ele;
        Scanner scanner = new Scanner(System.in);
        while(true) {
            ele = scanner.nextInt();
            if(ele < 0) {
                break;
            }
            System.out.println(searchMatrix(arr,ele));
        }
    }
    public static boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        if(matrix[0].length == 0) {
            return false;
        }
        int col = matrix[0].length;
        if(rows == 1) {
            return binarySearch(matrix,0,0,col-1,target);
        }
        int rowNumber = getRow(matrix,target,0,rows - 1);
        return binarySearch(matrix,rowNumber,0,col-1,target);
    }
    public static int getRow(int[][]arr,int key,int u,int l) {
        int col = arr[0].length;
        while(u < l) {
            int mid = u + (l-u)/2;
            if(arr[mid][0] == key || arr[mid][col -1] == key) {
                return mid;
            }
            if(arr[mid][0] > key) {
                l = mid -1;
            } else if(arr[mid][col - 1] < key) {
                u = mid + 1;
            } else if(arr[mid][0] < key && arr[mid][col - 1] > key) {
                return mid;
            }
        }
        return u;
    }

    public static boolean binarySearch(int[][] arr,int row,int cStart,int cEnd,int target) {
        while(cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart)/2;
            if(arr[row][mid] == target) {
                return true;
            }
            if(arr[row][mid] < target) {
                cStart = mid + 1;
            } else {
                cEnd = mid -1;
            }
        }
        return false;
    }
}
