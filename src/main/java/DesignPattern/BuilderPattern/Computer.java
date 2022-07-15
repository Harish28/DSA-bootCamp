package DesignPattern.BuilderPattern;

/**
 * Implementing Builder Pattern
 */
public class Computer {
    private final String Hdd;
    private final String RAM;
    private final boolean isGraphicCard;
    private final boolean isBluetooth;
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
        private final String Hdd;
        private final String RAM;
        private boolean isGraphicCard;
        private boolean isBluetooth;

        public ComputerBuilder(String hdd, String RAM) {
            Hdd = hdd;
            this.RAM = RAM;
        }

        public ComputerBuilder setGraphicCard(boolean graphicCard) {
            this.isGraphicCard = graphicCard;
            return this;
        }

        public ComputerBuilder setBluetooth(boolean bluetooth) {
            this.isBluetooth = bluetooth;
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
