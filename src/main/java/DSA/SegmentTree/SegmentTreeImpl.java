package DSA.SegmentTree;

import java.util.Scanner;
/*
10
4 2 5 7 1 8 9 3 6 10
 */
public class SegmentTreeImpl {
    private static int[] arr = new int[100001];
    private static int[] st  = new int[400004];
    public static int query(int si,int ss,int se,int l,int r) {
        if(l > se || r < ss) {
            return Integer.MAX_VALUE;
        }
        if(ss >= l && r >= se) {
            return st[si];
        }
        int mid = (ss + se)/2;
        int ll = query(2*si,ss, mid,l,r);
        int rr = query(2*si + 1,mid + 1,se,l,r);
        return Math.min(ll,rr);
    }

    public static void update(int si,int ss,int se,int qi) {
        if(ss == se) {
            st[si] = arr[ss];
            return ;
        }
        int mid = (ss + se)/2;
        if(qi <= mid) {
            update(2*si,ss, mid,qi);
        } else {
            update(2*si + 1,mid+1, se,qi);
        }
        st[si] = Math.min(st[2*si],st[2*si + 1]);
    }

    public static void buildTree(int si,int ss, int se) {
        if(ss == se) {
            st[si] = arr[ss];
            return;
        }
        int mid = (ss + se)/2;
        buildTree(2*si,ss,mid);
        buildTree(2*si + 1,mid + 1,se);
        st[si] = Math.min(st[2*si],st[2*si + 1]);
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
        while(q > 0) {
            q--;
            int l = scanner.nextInt();
            int r = scanner.nextInt();
            System.out.println(query(1,1, n,l+1,r+1));
        }
     }
}
