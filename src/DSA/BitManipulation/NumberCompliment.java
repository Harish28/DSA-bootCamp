package DSA.BitManipulation;

public class NumberCompliment {
    public static void main(String[] args) {
        int n = 5;
        int digits = (int) (Math.log(n)/Math.log(2)) + 1;
        int number = (int) Math.pow(2,digits) -1 ;
        System.out.println((n ^ number));
        char c1 = 'a';
        char c2 = 'b';
        System.out.println(c1 ^ c2);
    }
}
