package DSA.DisjointSet;

import java.util.Arrays;
import java.util.Scanner;

//https://assessment.hackerearth.com/challenges/college/codemania-20/algorithm/owl-fight/
public class OwlFight {
    public static void union(int[] par,int u,int v) {
        par[u] = Math.min(par[u],par[v]);
        par[v] = u;
    }

    public static int find(int[] par,int a) {
        if(par[a] < 0) {
            return a;
        }
        return par[a] = find(par,par[a]);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] par = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            par[i] = -i;
        }
        while(m>0) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            union(par,u,v);
            m--;
        }
        int q = scanner.nextInt();
        while(q > 0) {
            q--;
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int par_a = find(par,a);
            int par_b = find(par,b);
            if(par_a == par_b) {
                System.out.println("TIE");
            } else if(par[par_a] > par[par_b]) {
                System.out.println(b);
            } else {
                System.out.println(a);
            }
        }
    }
}
