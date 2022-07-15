package DSA.DisjointSet;

import java.util.Scanner;

public class RoadConstruction {
    public static int find(int a) {
        if (par[a] < 0) {
            return a;
        }
        return par[a] = find(par[a]);
    }

    public static void union(int u,int v) {
        int a = find(u);
        int b = find(v);
        if(a == b)  return ;
        if(rank[a] > rank[b]) {
            par[b] = a;
            rank[a]+= rank[b];
            sizeOfLargestComp = Math.max(sizeOfLargestComp,rank[a]);
        } else {
            par[a] = b;
            rank[b]+= rank[a];
            sizeOfLargestComp = Math.max(sizeOfLargestComp,rank[b]);
        }
        n--;

    }

    private static int par[] = new int[100001];
    private static int rank[] = new int[100001];
    private static int n,m;
    private static int sizeOfLargestComp = 1;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        for (int i = 1; i <= n ; i++) {
            par[i] = -1;
            rank[i] = 1;
        }
        while(m > 0) {
            m--;
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            union(u,v);
            System.out.println(n + " " + sizeOfLargestComp);
        }
    }
}
