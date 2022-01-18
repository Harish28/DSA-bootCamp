package DSA.Recursion;

import java.util.ArrayList;

public class FindAllIndex {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,4,7,4,8,4,9};
        System.out.println(findAllIndex(arr,4,0));
    }
    public static ArrayList<Integer> findAllIndex(int[] arr, int target, int index) {
        if(index == arr.length) {
            return new ArrayList<>();
        }
        ArrayList<Integer> l = new ArrayList<>();
        if(arr[index] == target) {
            l.add(index);
        }
        ArrayList<Integer> l1 = findAllIndex(arr,target,index+1);
        if(!l1.isEmpty()) {
            l.addAll(l1);
        }
        return l;
    }
}
