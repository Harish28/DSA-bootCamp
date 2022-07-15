package DSA.BinarySearch;

public class SearchIn2DPart2 {
    public static void main(String[] args) {
//        int[][] arr = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        int[][] arr = {{-1,-1}};
        System.out.println(searchMatrix(arr,2));
    }
    public static boolean binarySearch(int[][]arr,int row,int cStart,int cEnd,int target) {
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

    public static boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length -1 ;
        if(matrix[0].length == 0) {
            return false;
        }
        int col = 0;
        if(row == 0) {
            return binarySearch(matrix,0,0,matrix[0].length - 1,target);
        }

        while(row >= 0 && col < matrix.length) {
            if(matrix[col][row] == target) {
                return true;
            }
            if(matrix[col][row] > target) {
                row--;
            } else if(matrix[col][row] < target) {
                col++;
            }
        }
        return false;
    }
}
