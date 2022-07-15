package DSA.Graph.DFS;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class TrajanAlgoForCC {
    private static int[] vis = new int[31];
    private static int[] in = new int[31];
    private static int[] lowLink = new int[31];
    private static ArrayList<Integer>[] graph = new ArrayList[31];
    private static ArrayList<Integer> scc = new ArrayList<>();
    private static Stack<Integer> stack = new Stack<>();
    private static int[] isInStack = new int[31];
    private static int count = 0;
    private static int totalSCC = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t > 0) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            while(m > 0) {
                m--;
                int u = scanner.nextInt();
                int v = scanner.nextInt();
                if(graph[u] == null) {
                    graph[u] = new ArrayList<>();
                }
                graph[u].add(v);
            }
            for (int i = 1; i <= n; i++) {
                if(vis[i] == 0) {
                    scc.clear();
                    dfs(i);
                }
            }
            t--;
        }
    }
    public static void dfs(int s) {
        vis[s] = 1;
        stack.push(s);
        isInStack[s] = 1;
        in[s] = lowLink[s] = count++;
        for(int u : graph[s]) {
            if(vis[u] == 0) {
                dfs(u);
                if(isInStack[u] == 1) {
                    lowLink[s] = Math.min(lowLink[u], lowLink[s]);
                }
            } else if(isInStack[u] == 1) {
                lowLink[s] = Math.min(in[u], lowLink[s]);
            }
        }
        if(in[s] == lowLink[s]) {
            totalSCC++;
            System.out.println("SCC no: " + totalSCC);
            while(true) {
                int top = stack.pop();
                scc.add(top);
                isInStack[top] = 0;
                if(top == s) {
                    break;
                }
            }
            System.out.println("Nodes of SCC is:" + scc);
            scc.clear();
        }
    }
}
/*
100
8 12
1 2
2 3
3 1
2 8
3 4
8 4
4 8
7 8
5 4
5 7
7 6
6 5
 */