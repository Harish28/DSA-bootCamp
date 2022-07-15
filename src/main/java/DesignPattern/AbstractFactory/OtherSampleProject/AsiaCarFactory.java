package DesignPattern.AbstractFactory.OtherSampleProject;

public class AsiaCarFactory implements CarFactory{
    @Override
    public Car buildCar(CarType type) {
        Car car = null;
        switch (type) {
            case SEDAN: car = new Sedan(CarType.SEDAN);
            break;
            case LUXURY: car = new Luxury(CarType.LUXURY);
            break;
            case SMALL: car = new Small(CarType.SMALL);
            break;
            default:
                System.out.println("Wrong car type");
        }
        return car;
    }
}
