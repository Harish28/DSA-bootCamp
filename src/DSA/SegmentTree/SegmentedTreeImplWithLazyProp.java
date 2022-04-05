package DSA.SegmentTree;

import java.util.Scanner;

public class SegmentedTreeImplWithLazyProp {
    private static int[] arr = new int[100001];
    private static int[] st = new int[400004];
    private static int[] lazy = new int[400004];
    public static int query(int si,int ss,int se ,int l,int r) {
        if(lazy[si] != 0) {
            int v = lazy[si];
            lazy[si] = 0;
            st[si] += v * (se - ss +1 );
            lazy[si*2] += v;
            lazy[si*2 + 1] += v;
        }
        if(l > se || r < ss) {
            return 0;
        }
        if(ss >= l && r >= se) {
            return st[si];
        }
        int mid = (ss + se)/2;
        int ll = query(2*si,ss, mid,l,r);
        int rr = query(2*si + 1,mid + 1,se,l,r);
        return ll + rr;
    }

    public static void update(int si,int ss,int se ,int l,int r,int val) {
        if (lazy[si] != 0) {
            int v = lazy[si];
            lazy[si] = 0;
            st[si] += v*(se -ss +1);
            if(ss != se) {
                lazy[2*si] += v;
                lazy[2*si + 1] += v;
            }
        }
        if(l > se || r < ss) {
            return ;
        }
        if(ss >= l && r >= se) {
            int v = val*(se - ss + 1);
            st[si] += v;
            if(ss != se) {
                lazy[2*si] += val;
                lazy[2*si + 1] += val;
            }
            return;
        }
        int mid = (ss + se)/2;
        update(2*si,ss,mid,l,r,val);
        update(2*si + 1,mid + 1,se,l,r,val);
        st[si] = st[2*si] + st[2*si + 1];
        return;
    }
    public static void buildTree(int si,int ss, int se) {
        if(ss == se) {
            st[si] = arr[ss];
            return;
        }
        int mid = (ss + se)/2;
        buildTree(2*si,ss,mid);
        buildTree(2*si + 1,mid + 1,se);
        st[si] = st[2*si] + st[2*si + 1];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            int a = scanner.nextInt();
            arr[i] = a;
        }
        buildTree(1,1,n);
        int q = scanner.nextInt();
        while (q > 0) {
            q--;
            int type = scanner.nextInt();
            int l = scanner.nextInt();
            int r = scanner.nextInt();
            if(type == 1) {
                System.out.println(query(1,1,n,l,r));
            } else {
                int val = scanner.nextInt();
                update(1,1,n,l,r,val);
            }
        }
    }
}
