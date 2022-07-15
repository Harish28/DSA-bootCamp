package DesignPattern.AbstractFactory.OtherSampleProject;

public abstract class Car {
    private CarType type;
    private String model;
    Car(CarType type) {
        this.type = type;
    }
    public abstract void construct(CarType typ);
}
