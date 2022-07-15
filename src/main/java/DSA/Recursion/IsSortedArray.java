package DSA.Recursion;

public class IsSortedArray {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int[] b = {1,2,3,4,5,6,1};
        int[] d = {2,1,3,4,5,6,1};
        System.out.println(isArraySorted(a,0));
        System.out.println(isArraySorted(b,0));
        System.out.println(isArraySorted(d,0));
    }
    public static boolean isArraySorted(int[] arr,int index) {
        if(index == arr.length -1 ) {
            return true;
        }
        return ((arr[index] < arr[index + 1]) && (isArraySorted(arr, index+1)));
    }
}
