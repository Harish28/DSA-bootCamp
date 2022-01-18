package DSA.Recursion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombination {
    private static final Map<Integer,String> combinations = new HashMap<>();
    LetterCombination() {
        combinations.put(2,"abc");
        combinations.put(3,"def");
        combinations.put(4,"ghi");
        combinations.put(5,"jkl");
        combinations.put(6,"mno");
        combinations.put(7,"pqrs");
        combinations.put(8,"tuv");
        combinations.put(9,"wxyz");
    }
    public static void main(String[] args) {
        System.out.println(letterCombinations("23"));
    }
    public static List<String> letterCombinationsUtil(String digits,String cur) {
        if(digits.isEmpty()) {
            List<String> res = new ArrayList<>();
            res.add(cur);
            return res;
        }
        String s = combinations.get(Integer.parseInt(digits.substring(0,1)));
        List<String> res = new ArrayList<>();
        for(char c : s.toCharArray()) {
            res.addAll(letterCombinationsUtil(digits.substring(1),cur + c));
        }
        return res;
    }
    public static List<String> letterCombinations(String digits) {
        if(digits.length() == 0) {
            return new ArrayList<>();
        }
        if(digits.length() == 1) {
            String s = combinations.get(digits);
            List<String> res = new ArrayList<>();
            for(char c : s.toCharArray()) {
                res.add(String.valueOf(c));
            }
            return res;
        }
        return letterCombinationsUtil(digits,"");
    }
}
