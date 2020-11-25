package builder.example2;

public class Example {
    public static void main(String[] args) {

        Motor motor = new Motor.MotorBuilder(Type.DIESEL, "Diesel Motor").build();

        System.out.println(motor);

        Motor honda = new Motor.MotorBuilder(Type.OTTO, "Honda Motor").cylinder(10).ccm(999).price(20000).build();

        System.out.println(honda);
    }
}
