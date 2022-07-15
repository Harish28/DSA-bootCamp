package DesignPattern.AbstractFactory.OtherSampleProject;

public class AbstractCarFactory {
    CarFactory factory;
    AbstractCarFactory(CarFactory factory) {
        this.factory = factory;
    }
    public Car buildCar(CarType type) {
        return factory.buildCar(type);
    }
}
