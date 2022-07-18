package DSA.Sorting;

import java.util.Arrays;


//This count sort only works when elements are positive
public class CountingSort {
    public static void countSort(int[] arr) {
        //step 1 : find max ele
        int maxEle = Arrays.stream(arr).max().getAsInt();
        int minEle = Arrays.stream(arr).min().getAsInt();
        //step 2 : create an array of size maxEle;
        int[] count = new int[maxEle - minEle + 1];
        //step 3 : count each ele and store it in tmp array
        for(int i = 0; i<arr.length;i++) {
            count[arr[i] - minEle]++;
        }
        for(int i = 1; i<count.length;i++) {
            count[i] += count[i-1];
        }
        //step 4 : iterate the new count array and keep on adding the ele
        int output[] = new int[arr.length];
        for (int i = arr.length - 1 ; i >= 0 ;i--) {
            output[count[arr[i] - minEle] - 1] = arr[i];
            count[arr[i] - minEle]--;
        }
        for(int i = 0; i<output.length;i++) {
            arr[i] = output[i];
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,4,2,6,5,3,6,4,3,8,9,5,1,3,5,8,4};
        countSort(arr);
        Arrays.stream(arr).forEach(i -> System.out.print(i + " "));
    }
}
