package DSA.Strings;

import java.util.Scanner;

public class HashOfSubString {
    private static int[] dp = new int[1000];
    private static int[] inv = new int[1000];
    private static final int MOD = 1000000007;
    public static void main(String[] args) {
        String s = "abcdefgh";
        getHash(s);
        Scanner scanner = new Scanner(System.in);
        int t = 100;
        //scanner.nextLine();
        while(t > 0) {
            t--;
            int i = scanner.nextInt();
            int j = scanner.nextInt();
            System.out.println(getSubStringHash(s,i,j));
        }

    }

    public  static int inverse(int a , int n) {
        int result = 1;

        while(n > 0)
        {
            if((n & 1) != 0) result = (result * a) % MOD;

            n >>= 1;
            a = (a * a) % MOD;
        }

        return result;
    }

    public static void getHash(String s) {
        int pPower = 1;
        int p = 31;
        dp[0] = (s.charAt(0)-'a' + 1) % MOD;
        inv[0] = 1;
        for(int i = 1; i<s.length();i++) {
            pPower = (pPower*p) % MOD;
            inv[i] = inverse(pPower,MOD - 2);
            dp[i] = (dp[i-1] + (s.charAt(i) - 'a' + 1)*pPower) % MOD;
        }
    }
    public static int getSubStringHash(String s , int i , int j) {

        int res = dp[j];
        if(i > 0) {
            res-= dp[i-1];
        }
        return (res*inv[i]) % MOD;
    }
}
