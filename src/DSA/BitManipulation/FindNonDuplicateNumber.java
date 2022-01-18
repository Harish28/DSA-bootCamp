package DSA.BitManipulation;

public class FindNonDuplicateNumber {
    public static void main(String[] args) {
        int[] arr = {2,4,6,5,2,4,5,6,9};
        System.out.println(nonDuplicateNumber(arr));
    }
    public static int nonDuplicateNumber(int[] arr) {
        int res = arr[0];
        for(int i = 1; i< arr.length;i++) {
            res = res^arr[i];
        }
        return res;
    }
}
