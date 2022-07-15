package DSA.Strings;

public class StringDemo {
    public static void main(String[] args) {
        String s1 = "Harish";
        String s2 = "Harish";
        String s3 = new String("Harish");
        String s4 = new String("Harish");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s3);
        System.out.println(s4 == s3);
    }
}
