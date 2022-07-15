package DesignPattern.CodeRendering;
import javafx.util.Pair;

public class CodeBuilder {
    private Code code = new Code();

    public CodeBuilder(String className) {
        this.code.setClassName(className);
    }

    public CodeBuilder addFields(String name, String type) {
        code.getClassMembers().add(new Pair(type, name));
        return this;
    }

    public Code build() {
        return code;
    }
}
