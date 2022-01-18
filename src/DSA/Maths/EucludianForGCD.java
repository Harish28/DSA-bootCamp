package DSA.Maths;

public class EucludianForGCD {
    public static void main(String[] args) {
        int a = 224;
        int b = 105;
        System.out.printf("GCD is :%s", gcd(a,b));
    }
    public static int gcd(int a , int b) {
        if(b == 0) {
            return a;
        }
        return gcd(b, a%b);
    }
}
