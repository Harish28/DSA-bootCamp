package DSA.DisjointSet;

public class PathCompAndUnionByRank {
    private static int[] par = new int[1001];
    private static int[] Rank = new int[1001];

    public static void union(int a ,int b) {
        int par_a = find(a);
        int par_b = find(b);
        if(par_a == par_b) return ;
        if(Rank[par_a] > Rank[par_b]) {
            par[par_b] = a;
            Rank[par_a]+= Rank[par_b];
        } else {
            par[par_a] = par_b;
            Rank[par_b]+= Rank[par_a];
        }
    }

    public static int find(int a) {
        if(par[a] < 0) return a;

        return par[a] = find(par[a]);
    }
    public static void main(String[] args) {

    }
}
