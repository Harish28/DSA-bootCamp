package DSA.Recursion;

import java.util.*;

public class ArraySubset {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        for(List<Integer> l: subset(arr)) {
            System.out.println(l);
        }
        System.out.println("-------------------------");
        int[] arr2 =  {2,4,2};
        for(List<Integer> l: subSetWithDuplicate(arr2)) {
            System.out.println(l);
        }

    }
    public static List<List<Integer>> subset(int[] arr) {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        for(int ele : arr) {
            int n = outer.size();
            for(int i = 0;i<n;i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(ele);
                outer.add(internal);
            }
        }
        return outer;
    }

    public static List<List<Integer>> subSetWithDuplicate(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        outer.add(new ArrayList<>(Arrays.asList(arr[0])));
        List<List<Integer>> prevInternal = new ArrayList<>();
        for(int j = 1; j<arr.length;j++) {
            int n;
            List<List<Integer>> prevInt = new ArrayList<>();
            if(arr[j] == arr[j-1]) {
                n = prevInternal.size();
                for(int i = 0;i<n;i++) {
                    List<Integer> internal = new ArrayList<>(prevInternal.get(i));
                    internal.add(arr[j]);
                    outer.add(internal);
                    prevInt.add(internal);
                }
            } else {
                n = outer.size();
                for(int i = 0;i<n;i++) {
                    List<Integer> internal = new ArrayList<>(outer.get(i));
                    internal.add(arr[j]);
                    outer.add(internal);
                    prevInt.add(internal);
                }
            }
            prevInternal = prevInt;
        }
        return outer;
    }
}
