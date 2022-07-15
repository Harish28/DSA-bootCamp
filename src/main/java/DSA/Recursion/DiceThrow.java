package DSA.Recursion;

import java.util.ArrayList;
import java.util.List;

public class DiceThrow {
    public static void main(String[] args) {
        System.out.println(diceThrow("",4));
    }
    public static List<String> diceThrow(String p,int target) {
        if(target == 0) {
            List<String> res = new ArrayList<>() ;
            //System.out.println(p);
            res.add(p);
            return res;
        }
        List<String> res = new ArrayList<>();
        for(int i = 1;i<=6;i++) {
            if(i <= target) {
                res.addAll(diceThrow(p +" " + i,target - i));
            }
        }
        return res;
    }
}
