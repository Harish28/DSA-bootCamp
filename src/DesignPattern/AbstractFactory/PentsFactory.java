package DesignPattern.AbstractFactory;

public class PentsFactory implements AbstractFactory{
    @Override
    public Product createProduct() {
        return new Pents();
    }
}
