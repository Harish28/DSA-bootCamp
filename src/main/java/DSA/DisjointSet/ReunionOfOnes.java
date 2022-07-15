package DSA.DisjointSet;

import java.util.Scanner;

public class ReunionOfOnes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        String s = scanner.next();
        int [] par = new int[n];
        int [] rank = new int[n];
        while(k > 0) {
            k--;
            int b;
            int a = scanner.nextInt();
            if(a == 1) {
                //get the longest 1s substring
            } else if(a == 2) {
                b = scanner.nextInt();
                char[] c = s.toCharArray();
                c[b] = '1';
                s = String.valueOf(c);
            }
        }
    }
}
