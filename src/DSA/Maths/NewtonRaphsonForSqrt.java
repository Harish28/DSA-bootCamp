package DSA.Maths;

public class NewtonRaphsonForSqrt {
    public static void main(String[] args) {
        int n = 40;
        double x = n;
        double root;
        while(true) {
            root = 0.5*(x + n/x);
            if(Math.abs(root-x) < 1) {
                break;
            }
            x = root;
        }
        System.out.printf("%.3f",root);
    }
}
