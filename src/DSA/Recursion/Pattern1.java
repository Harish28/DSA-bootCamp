package DSA.Recursion;

public class Pattern1 {
    /*

    * * * *
    * * *
    * *
    *
     */
    public static void printPattern(int r,int c) {
        if(r == 0) {
            return ;
        }
        if(r == c) {
            System.out.println("\n");
            printPattern(r-1,0);
        } else {
            System.out.print("* ");
            printPattern(r,c+1);
        }
    }
    public static void main(String[] args) {
        printPattern(4,0);
    }
}
