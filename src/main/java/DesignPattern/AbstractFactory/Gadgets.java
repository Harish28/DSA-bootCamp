package DesignPattern.AbstractFactory;

import static java.lang.Thread.sleep;

public class Gadgets implements Product{
    @Override
    public ProductType getType() {
        return ProductType.Gadget;
    }
    @Override
    public void getProduct() throws InterruptedException {
        System.out.println("Creating Gadget...");
        sleep(2);
        System.out.println("Gadget has been created");
    }
}
