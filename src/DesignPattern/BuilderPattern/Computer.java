package DesignPattern.BuilderPattern;

/**
 * Implementing Builder Pattern
 */
public class Computer {
    private String Hdd;
    private String RAM;
    private boolean isGraphicCard;
    private boolean isBluetooth;
    private Computer(ComputerBuilder builder) {
        this.Hdd = builder.Hdd;
        this.RAM = builder.RAM;
        this.isBluetooth = builder.isBluetooth;;
        this.isGraphicCard = builder.isGraphicCard;;
    }

    public String getHdd() {
        return Hdd;
    }

    public String getRAM() {
        return RAM;
    }

    public boolean isGraphicCard() {
        return isGraphicCard;
    }

    public boolean isBluetooth() {
        return isBluetooth;
    }
    public  static class ComputerBuilder {
        private String Hdd;
        private String RAM;
        private boolean isGraphicCard;
        private boolean isBluetooth;

        public ComputerBuilder(String hdd, String RAM) {
            Hdd = hdd;
            this.RAM = RAM;
        }

        public ComputerBuilder setGraphicCard(boolean graphicCard) {
            isGraphicCard = graphicCard;
            return this;
        }

        public ComputerBuilder setBluetooth(boolean bluetooth) {
            isBluetooth = bluetooth;
            return this;
        }
        public Computer build() {
            return new Computer(this);
        }
    }

    @Override
    public String toString() {
        return "Computer{" +
                "Hdd='" + Hdd + '\'' +
                ", RAM='" + RAM + '\'' +
                ", isGraphicCard=" + isGraphicCard +
                ", isBluetooth=" + isBluetooth +
                '}';
    }
}
