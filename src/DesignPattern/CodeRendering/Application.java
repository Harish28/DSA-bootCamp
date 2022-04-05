package DesignPattern.CodeRendering;

public class Application {
    public static void main(String[] args) {
        CodeBuilder cb = new CodeBuilder("Person");
        cb.addFields("Name","String");
        cb.addFields("Age","Integer");
        cb.addFields("Salary","Integer");
        Code c = cb.build();
        System.out.println(c.toString());
    }
}
