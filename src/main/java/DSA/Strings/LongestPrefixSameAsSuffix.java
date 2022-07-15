package DSA.Strings;

import java.util.Arrays;

public class LongestPrefixSameAsSuffix {
    public static void main(String[] args) {
        longestPrefixMatchesWithSuffix("abcdeabfabc");
    }
    public static void longestPrefixMatchesWithSuffix(String s) {
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
        Arrays.stream(psm).forEach(i -> System.out.print(i + " "));
    }
}
