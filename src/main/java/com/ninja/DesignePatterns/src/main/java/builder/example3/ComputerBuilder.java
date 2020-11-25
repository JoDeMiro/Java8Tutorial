package builder.example3;

public class ComputerBuilder {

    private String HDD;
    private String RAM;

    private boolean isGraphicsCardEnabled;
    private boolean isBluetoothEnabled;

    public ComputerBuilder(String HDD, String RAM) {
        this.HDD = HDD;
        this.RAM = RAM;
    }

    public ComputerBuilder setGraphicsCardEnabled(boolean graphicsCardEnabled) {
        isGraphicsCardEnabled = graphicsCardEnabled;
        return this;
    }

    public ComputerBuilder setBluetoothEnabled(boolean bluetoothEnabled) {
        isBluetoothEnabled = bluetoothEnabled;
        return this;
    }

    public Computer build() {
        return new Computer(this);
    }

    public String getHDD() {
        return HDD;
    }

    public String getRAM() {
        return RAM;
    }

    public boolean isGraphicsCardEnabled() {
        return isGraphicsCardEnabled;
    }

    public boolean isBluetoothEnabled() {
        return isBluetoothEnabled;
    }
}
