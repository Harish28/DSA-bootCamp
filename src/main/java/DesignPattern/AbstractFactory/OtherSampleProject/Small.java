package DesignPattern.AbstractFactory.OtherSampleProject;

public class Small extends Car {
    Small(CarType type) {
        super(type);
    }
    @Override
    public void construct(CarType type) {
        System.out.println("Building car of type " + type);
    }
}
