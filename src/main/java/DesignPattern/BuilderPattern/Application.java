package DesignPattern.BuilderPattern;


public class Application {
    public static void main(String[] args) {
        Computer c1 = new Computer.ComputerBuilder("512 GB", "16GB").setBluetooth(true).setGraphicCard(true).build();
        Computer c2 = new Computer.ComputerBuilder("512 GB", "16GB").setBluetooth(false).build();
        Computer c3 = new Computer.ComputerBuilder("512 GB", "16GB").build();
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }
}
