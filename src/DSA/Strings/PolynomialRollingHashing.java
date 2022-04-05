package DSA.Strings;

import java.util.Scanner;

public class PolynomialRollingHashing {
    private static final int MOD = 1000000007;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            String s = scanner.next();
            if(s.equals("-1")) break;
            System.out.println(getHash(s));
        }
    }
    public static int getHash(String s) {
        int hashValue = 0;
        int p = 31;
        int pPower = 1;
        for(char c : s.toCharArray()) {
            hashValue = (hashValue + (c - 'a' + 1)*pPower) % MOD;
            pPower = pPower*p % MOD;
        }
        return hashValue;
    }
}
