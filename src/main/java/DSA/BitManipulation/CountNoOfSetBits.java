package DSA.BitManipulation;

public class CountNoOfSetBits {
    public static void main(String[] args) {
        int a = 127;
        int count = 0;
        while(a > 0) {
            if((a & 1) == 1) {
                count++;
            }
            a = a>>1;
        }
        System.out.println(count);

    }
}
