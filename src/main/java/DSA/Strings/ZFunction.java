package DSA.Strings;

import java.util.Arrays;

public class ZFunction {
    public static void main(String[] args) {
        String s = "aaabaab";
        int[] zArray = getZArray(s);
        Arrays.stream(zArray).forEach(i -> System.out.print(i + " "));
    }
    public static int[] getZArray(String s) {
        if(s == null || s.isEmpty()) {
            return new int[0];
        }
        int n = s.length();
        int[] zArray = new int[n];
        zArray[0] = 0;
        int l = 0,r=0;
        for(int i = 1 ; i<n;i++) {
            if(i <= r) {
                zArray[i] = Math.min(r-i+1,zArray[i-l]);
            }
            while (i + zArray[i] < n && s.charAt(zArray[i]) == s.charAt(i + zArray[i])) {
                ++zArray[i];
            }
            if(i + zArray[i] -1 > r) {
                l = i;
                r = i + zArray[i] - 1;
            }
        }
        return zArray;
    }
}
