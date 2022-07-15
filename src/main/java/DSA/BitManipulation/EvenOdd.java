package DSA.BitManipulation;

public class EvenOdd {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        System.out.println(isOdd(a));
        System.out.println(isOdd(b));
        System.out.println(isOdd(c));
    }
    public static boolean isOdd(int n) {
        return (n & 1) == 1;
    }
}
