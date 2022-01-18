package DesignPattern.AbstractFactory;

public class GadgetFactory implements AbstractFactory{
    @Override
    public Product createProduct() {
        return new Gadgets();
    }
}
