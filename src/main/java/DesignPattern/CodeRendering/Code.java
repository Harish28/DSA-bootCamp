package DesignPattern.CodeRendering;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;

public class Code {
    private String className;
    private List<Pair<String,String>> classMembers = new ArrayList<>();

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public List<Pair<String, String>> getClassMembers() {
        return classMembers;
    }

    public void setClassMembers(List<Pair<String, String>> classMembers) {
        this.classMembers = classMembers;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("public ");
        sb.append("class ");
        sb.append(className);
        sb.append(" {");
        sb.append(System.lineSeparator());
        for(Pair<String,String> p : classMembers) {
            sb.append("   ");
            sb.append(p.getKey());
            sb.append(" ");
            sb.append(p.getValue() + ";");
            sb.append(System.lineSeparator());
        }
        sb.append(" }");
        return sb.toString();
    }
}
