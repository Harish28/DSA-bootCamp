package DesignPattern.AbstractFactory;

public class ShirtsFactory implements AbstractFactory{
    @Override
    public Product createProduct() {
        return new Shirts();
    }
}
