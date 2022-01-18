package DSA.BitManipulation;


public class NoOfDigitsInBase {
    public static void main(String[] args) {
        int n = 34567;
        int base = 2;
        int digits = (int)(Math.log(n)/Math.log(base)) + 1;
        System.out.println(digits);
    }
}
