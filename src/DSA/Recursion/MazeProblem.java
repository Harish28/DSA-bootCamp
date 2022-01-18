package DSA.Recursion;

import java.util.ArrayList;
import java.util.List;

public class MazeProblem {
    public static void main(String[] args) {
        //System.out.println(countPath(3,3));
       // System.out.println(AllPaths("",3,3));
        System.out.println(countPathWithDiag(3,3));
        printAllPath("",3,3);
        boolean[][] maze = {
                {true,true,true},
                {true,false,true},
                {true,true,true}
        };
        printPathAllDir("", maze,0,0);
    }
    public static int countPath(int r,int c) {
        if(r == 1 || c == 1) {
            return 1;
        }
        return countPath(r-1,c) + countPath(r,c-1);
    }
    public static int countPathWithDiag(int r,int c) {
        if(r == 1 || c == 1) {
            return 1;
        }
        return countPathWithDiag(r-1,c) + countPathWithDiag(r,c-1) + countPathWithDiag(r-1,c-1);
    }
    public static void printAllPath(String p , int r,int c) {
        if(r == 1 && c == 1) {
            System.out.println(p);
            return ;
        }
        if(r == 1) {
            printAllPath(p + "H",r,c-1);
            return ;
        }
        if(c == 1) {
            printAllPath(p + "V",r-1,c);
            return ;
        }
        printAllPath(p + "H",r,c-1);
        printAllPath(p + "V",r-1,c);
        printAllPath(p + "D",r-1,c-1);
    }

    public static List<String> AllPaths(String p , int r, int c) {
        if(r == 1) {
            while(c > 1) {
                p += "R";
                c--;
            }
            List<String> res  = new ArrayList<>();
            res.add(p);
            return res;
        }
        if(c == 1) {
            while(r > 1) {
                p += "D";
                r--;
            }
            List<String> res  = new ArrayList<>();
            res.add(p);
            return res;
        }
        List<String> left = AllPaths(p + "R",r,c-1);
        left.addAll(AllPaths(p + "D",r-1,c));
        return left;
    }

    public static void printPathAllDir(String p ,boolean[][] maze, int r,int c) {
        if(r == maze.length-1 && c == maze[0].length-1) {
            System.out.println(p);
            return ;
        }
        if(!maze[r][c]) {
            return;
        }
        maze[r][c] = false;
        if(r == maze.length-1) {
            printAllPath(p + "R",r,c+1);
            return ;
        }
        if(c == maze[0].length -1 ) {
            printAllPath(p + "D",r+1,c);
            return ;
        }

        if(r > 0) {
            printAllPath(p + "U",r -1,c);
        }
        if(r < maze.length -1) {
            printAllPath(p + "D",r+1,c);
        }
        if(c > 0) {
            printAllPath(p + "L",r,c-1);
        }
        if(c < maze[0].length -1 ) {
            printAllPath(p + "R",r,c+1);
        }
        maze[r][c] = true;
    }
}
