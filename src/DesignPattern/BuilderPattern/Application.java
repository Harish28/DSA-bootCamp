package DesignPattern.BuilderPattern;


public class Application {
    public static void main(String[] args) {
        Computer c = new Computer.ComputerBuilder("512 GB", "16GB").setBluetooth(false).setGraphicCard(true).build();
        System.out.println(c);
    }
}
