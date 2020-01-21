package DesignPattern.BuilderDesignPattern;

public class Computer {

   // Required Params
    int PROCESSOR;
    int RAM;
    int HDD;

    // Optional Params
    boolean isBlueToothEnabled;
    boolean isGraphicsCardEnabled;

    public Computer(builder builder) {
        PROCESSOR = builder.PROCESSOR;
        RAM = builder.RAM;
        HDD = builder.HDD;
        isBlueToothEnabled = builder.isBlueToothEnabled;
        isGraphicsCardEnabled = builder.isGraphicsCardEnabled;
    }

    public int getPROCESSOR() {
        return PROCESSOR;
    }

    public int getRAM() {
        return RAM;
    }

    public int getHDD() {
        return HDD;
    }

    public boolean isBlueToothEnabled() {
        return isBlueToothEnabled;
    }

    public boolean isGraphicsCardEnabled() {
        return isGraphicsCardEnabled;
    }

    static class builder {
        // Required Params
        int PROCESSOR;
        int RAM;
        int HDD;

        // Optional Params
        boolean isBlueToothEnabled;
        boolean isGraphicsCardEnabled;

        builder(int processor, int ram, int hdd) {
            PROCESSOR = processor;
            RAM = ram;
            HDD = hdd;
        }

        public builder setBlueToothEnabled(boolean blueToothEnabled) {
            isBlueToothEnabled = blueToothEnabled;
            return this;
        }

        public builder setGraphicsCardEnabled(boolean graphicsCardEnabled) {
            isGraphicsCardEnabled = graphicsCardEnabled;
            return this;
        }

        public Computer build () {
            return new Computer(this);
        }
    }

}
