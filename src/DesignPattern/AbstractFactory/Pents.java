package DesignPattern.AbstractFactory;

import static java.lang.Thread.sleep;

public class Pents implements Product{
    @Override
    public ProductType getType() {
        return ProductType.Pent;
    }
    @Override
    public void getProduct() throws InterruptedException {
        System.out.println("Creating Pents...");
        sleep(2);
        System.out.println("Pents has been created");
    }
}
