package DesignPattern.AbstractFactory;

import static java.lang.Thread.sleep;

public class Shirts implements Product {
    @Override
    public ProductType getType() {
        return ProductType.Shirt;
    }

    @Override
    public void getProduct() throws InterruptedException {
        System.out.println("Creating Shirts...");
        sleep(2);
        System.out.println("Shirts has been created");
    }
}
