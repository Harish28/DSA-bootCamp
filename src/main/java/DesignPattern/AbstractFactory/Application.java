package DesignPattern.AbstractFactory;

public class Application {
    public static void main(String[] args) {
        Product p1 = ProductFactory.getProduct(new ShirtsFactory());
        System.out.println(p1.getType());
    }
}
