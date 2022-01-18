import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test {
    public static void main(String[] args) {
        String s = "fdgsfdhgdsfhgsfdghsdfghsdf,dfghsdfg,sdefgsdfg,sdfgsdfgsdgdsfggdsfg,[fdsg [a, b, sdfa, fds, asfdg, fasdgasf]]";
        //String s = "[fdsg [";
        Matcher m = Pattern.compile("\\[[a-zA-Z0-9]+ \\[[[a-zA-Z0-9]+, ]+\\]\\]").matcher(s);
        while(m.find()) {
            System.out.println(m.start());
            System.out.println(m.end());
        }
        //System.out.println(Pattern.compile("\\[[a-zA-Z0-9]+ \\[").matcher(s).f);



    }
}
