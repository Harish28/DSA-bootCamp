package DSA.Recursion;

public class RemoveAllAs {
    public static void main(String[] args) {
        String s = "aba";
        StringBuilder b = new StringBuilder();
        System.out.println(removeAllA(s,0,b));
        System.out.println(removeAllApple("aappleappleppleHarish"));
    }
    public static String removeAllA(String s, int index,StringBuilder sb) {
        if(index == s.length()) {
            return sb.toString();
        }
        if(s.charAt(index) != 'a') {
            sb.append(s.charAt(index));
        }
        return removeAllA(s,index+1,sb);
    }

    public static String removeAllApple(String s) {
        if(s.isEmpty()) {
            return "";
        }
        if(s.startsWith("apple")) {
            return removeAllApple(s.substring(5));
        } else {
            return s.charAt(0) + removeAllApple(s.substring(1));
        }
    }
}
