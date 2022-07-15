package DesignPattern.AbstractFactory.OtherSampleProject;

public class Sedan extends Car{
    Sedan(CarType type) {
        super(type);
    }
    @Override
    public void construct(CarType type) {
        System.out.println("Building car of type " + type);
    }
}
