package DSA.Recursion;

import java.util.ArrayList;
import java.util.List;

public class AllSubset {
    private static List<String> res = new ArrayList<>();
    public static void main(String[] args) {
        String s = "abc";
        System.out.println(findAllSubset(s,""));
        System.out.println(findAllSubsetWithOutList(s,""));
    }
    public static List<String> findAllSubset(String s,String cur) {
        if(s.isEmpty()) {
            res.add(cur);
            return res;
        }
        findAllSubset(s.substring(1),cur + s.charAt(0));
        findAllSubset(s.substring(1),cur);
        return res;
    }

    public static List<String> findAllSubsetWithOutList(String s,String cur) {
        if(s.isEmpty()) {
            List<String> l = new ArrayList<>();
            l.add(cur);
            return l;
        }
        List<String> l1 = findAllSubsetWithOutList(s.substring(1),cur + s.charAt(0));
        l1.addAll(findAllSubsetWithOutList(s.substring(1),cur));
        return l1;
    }
}
