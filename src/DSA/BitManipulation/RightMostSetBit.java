package DSA.BitManipulation;

public class RightMostSetBit {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(rightMostSetBit(n));
    }
    public static int rightMostSetBit(int n) {
        int count = 0;
        while(n != 0) {
            if((n & 1) != 0) {
                return count;
            } else {
                count++;
                n = n >>1;
            }
        }
        return count;
    }
}
