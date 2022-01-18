package DesignPattern.DecoratorPattern;

public class Application {
    public static void main(String[] args) {
        ChristmasTree tree = new Garlend(new LightsDecorator(new ChristmasTreeImpl()));
        tree.decorate();
    }
}
