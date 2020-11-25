package builder.example3;

public class Computer {

    private String HDD;
    private String RAM;

    private boolean isGraphicsCardEnabled;
    private boolean isBluetoothEnabled;

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

    public Computer(ComputerBuilder builder) {
        this.HDD = builder.getHDD();
        this.RAM = builder.getRAM();
        this.isGraphicsCardEnabled = builder.isGraphicsCardEnabled();
        this.isBluetoothEnabled = builder.isBluetoothEnabled();
    }

    public void method() {
        System.out.println("This is a method inside the computer class");
    }

    @Override
    public String toString() {
        return "Computer{" +
                "HDD='" + HDD + '\'' +
                ", RAM='" + RAM + '\'' +
                ", isGraphicsCardEnabled=" + isGraphicsCardEnabled +
                ", isBluetoothEnabled=" + isBluetoothEnabled +
                '}';
    }
}
