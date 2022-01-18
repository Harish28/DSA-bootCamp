package DesignPattern.AbstractFactory;

public interface Product {
    ProductType getType();
    void getProduct() throws InterruptedException;
}
