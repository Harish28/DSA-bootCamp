package DSA.Strings;

import java.util.Scanner;

public class PatternMatchingWithSlidingWindow {
    public static int patternMatcher(String t, String p) {
        if(p.length() == 0) {
            return 0;
        }
        if(t.length() == 0) {
            return -1;
        }
        int i = 0;
        while(i <= t.length() - p.length()) {
            if(p.equals(t.substring(i,i + p.length()))) {
                return i;
            }
            i++;
        }
        return -1;
    }
    public static void main(String[] args) {
        String t = "Dhruva was son of utanpada";
        String p;
        while(true) {
            Scanner scanner = new Scanner(System.in);
            p = scanner.next();
            if(p.equals("-1")) {
                break;
            }
            System.out.println(patternMatcher(t,p));
        }
    }
}
