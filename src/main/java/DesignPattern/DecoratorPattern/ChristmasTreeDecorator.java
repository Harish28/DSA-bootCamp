package DesignPattern.DecoratorPattern;

public abstract class ChristmasTreeDecorator implements ChristmasTree {
    private ChristmasTree tree;

    public ChristmasTreeDecorator(ChristmasTree tree) {
        this.tree = tree;
    }

    @Override
    public void decorate() {
        tree.decorate();
    }
}
