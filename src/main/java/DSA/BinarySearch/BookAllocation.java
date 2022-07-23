package DSA.BinarySearch;
import java.util.*;
public class BookAllocation {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(10,20,30,40);
        System.out.println("no of books: " + allocateBooks(arr,4,2));
    }
        public static boolean validatePages(List<Integer> arr,int noOfStudents,int maxNoOfPages) {
            int students = 1;
            int sum = 0;
            for(int i = 0; i<arr.size();i++) {
                if(arr.get(i) > maxNoOfPages) {
                    return false;
                }
                sum += arr.get(i);
                if(sum > maxNoOfPages) {
                    sum = arr.get(i);
                    students++;
                    if(students > noOfStudents) {
                        return false;
                    }
                }
            }
            return true;
        }
        public static int allocateBooks(List<Integer> arr, int n, int m) {
            int s = 0;
            int e = arr.stream().reduce(0, (a, b) -> a + b);
            //System.out.println(e);
            int ans = -1;
            while(s <= e) {
                int mid = s + (e - s)/2;
                if(validatePages(arr,m,mid)) {
                    ans = mid;
                    e = mid - 1;
                } else {
                    s = mid + 1;
                }
            }
            return ans;
        }
}
