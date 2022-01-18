package DSA.Recursion;

import java.util.List;

public class PowerSet {
    public static void main(String[] args) {
        powerSet("abc",0,1);
        //powerSet("abc");
    }

    public static void powerSet(String s,int i,int j) {
        if(i == s.length()) {
            return ;
        }
        if(j > s.length()) {
            powerSet(s,i+1,i+2);
        }
        System.out.println(s.substring(i,j));
        powerSet(s,i,j+1);
    }

    public static void powerSet(String s) {
        for(int i  = 1 ; i <= s.length();i++) {
            for(int j = 0;j <=s.length() - i;j++) {
                int k = i + j;
                System.out.println(s.substring(j,k));
            }
        }
    }
}
