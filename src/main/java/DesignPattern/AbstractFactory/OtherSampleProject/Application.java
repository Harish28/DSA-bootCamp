package DesignPattern.AbstractFactory.OtherSampleProject;

public class Application {
    public static void main(String[] args) {
        AbstractCarFactory factory = new AbstractCarFactory(new AsiaCarFactory());
        factory.buildCar(CarType.SMALL).construct(CarType.SEDAN);
        factory.buildCar(CarType.LUXURY);
        factory.buildCar(CarType.SEDAN);
    }
}
