package DesignPattern.DecoratorPattern;

public class LightsDecorator extends ChristmasTreeDecorator {
    public LightsDecorator(ChristmasTree tree) {
        super(tree);
    }
    @Override
    public void decorate() {
        System.out.println("Lights");
    }
}
