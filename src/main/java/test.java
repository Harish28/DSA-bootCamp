import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class test {
    public static void main(String[] args) {
//        String s = "fdgsfdhgdsfhgsfdghsdfghsdf,dfghsdfg,sdefgsdfg,sdfgsdfgsdgdsfggdsfg,[fdsg [a, b, sdfa, fds, asfdg, fasdgasf]]";
//        //String s = "[fdsg [";
//        Matcher m = Pattern.compile("\\[[a-zA-Z0-9]+ \\[[[a-zA-Z0-9]+, ]+\\]\\]").matcher(s);
//        while(m.find()) {
//            System.out.println(m.start());
//            System.out.println(m.end());
//        }
////        //System.out.println(Pattern.compile("\\[[a-zA-Z0-9]+ \\[").matcher(s).f);String
//        String s1 = "Harish";
//        Stream<Character> st = s1.chars().mapToObj(ch -> (char) ch);
//        st.forEach(ch -> System.out.println(ch));
//
//        LinkedList l = new LinkedList();
//
//        LocalDateTime ldt = LocalDateTime.parse("2022-03-01T22:50:43-5:00[America/Newyork]");
//        ZonedDateTime zonedDateTime = ZonedDateTime.of(ldt, ZoneId.of("America/Newyork"));
        int[][] arr = {{1,5},{7,3},{3,5}};
        System.out.println(Arrays.stream(arr).mapToInt(i -> Arrays.stream(i).sum()).max().getAsInt());
        Set<String> st = new HashSet<>();
        st.add("adas");
        st.add("adasasfer");
        st.add("adasd");
    }
}
