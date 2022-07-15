package DesignPattern.DecoratorPattern;

public class Garlend extends ChristmasTreeDecorator{
    public Garlend(ChristmasTree tree) {
        super(tree);
    }
    @Override
    public void decorate() {
        System.out.println("Garlend");
    }
}
