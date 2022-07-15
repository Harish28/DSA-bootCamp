package DSA.BitManipulation;

public class PowerOf2 {
    public static void main(String[] args) {
        int n = 7;
        System.out.println(isPowOf2(n));

    }
    public static boolean isPowOf2(int n ) {
        return (n & (n-1)) == 0;
    }
}
