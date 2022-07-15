package DesignPattern.AbstractFactory.OtherSampleProject;

public class Luxury extends Car {

    Luxury(CarType type) {
        super(type);
    }
    @Override
    public void construct(CarType type) {
        System.out.println("Building car of type " + type);
    }
}
