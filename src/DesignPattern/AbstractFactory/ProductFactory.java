package DesignPattern.AbstractFactory;

public class ProductFactory {
    public static Product getProduct(AbstractFactory factory) {
        return factory.createProduct();
    }
}
