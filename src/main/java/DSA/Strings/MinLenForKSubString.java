package DSA.Strings;

import java.util.Arrays;
import java.util.Scanner;

public class MinLenForKSubString {
    public static int[] longestPrefixMatchesWithSuffix(String s) {
        int[] psm = new int[s.length()];
        psm[0] = 0;
        for(int i = 1; i<s.length();i++) {
            int j = psm[i-1];
            while(j > 0 && s.charAt(j) != s.charAt(i)) {
                j = psm[j-1];
            }
            if(s.charAt(j) == s.charAt(i)) {
                j++;
            }
            psm[i] = j;
        }
        return psm;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = 100;
        while(t > 0) {
            t--;
            String s = scanner.next();
            int k = scanner.nextInt();
            int[] psm = longestPrefixMatchesWithSuffix(s);
            System.out.println("Min length :" + s.length() + (k-1)*(s.length() - psm[s.length() - 1]));
        }
    }

}
