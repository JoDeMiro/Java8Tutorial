package builder.example3;

public class Example {
    public static void main(String[] args) {

        Computer computer = new ComputerBuilder("500 GB", "16 GB").build();

        computer.method();

        System.out.println(computer);


        Computer apple = new ComputerBuilder("600 GB", "8 GB").setBluetoothEnabled(true).build();

        apple.method();

        System.out.println(apple);


        Computer ibm = new ComputerBuilder("120 GB", "8 GB").setGraphicsCardEnabled(true).build();

        ibm.method();

        System.out.println(ibm);

    }
}
