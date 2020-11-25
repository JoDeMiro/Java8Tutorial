package builder.example2;

public class Motor {

    private final Type type;
    private final String name;
    private final Integer cylinder;
    private final Integer ccm;
    private final Integer price;

    public Motor(MotorBuilder builder) {
        this.type = builder.type;
        this.name = builder.name;
        this.cylinder = builder.cylinder;
        this.ccm = builder.ccm;
        this.price = builder.price;
    }

    public Type getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public Integer getCylinder() {
        return cylinder;
    }

    public Integer getCcm() {
        return ccm;
    }

    public Integer getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "type=" + type +
                ", name='" + name + '\'' +
                ", cylinder=" + cylinder +
                ", ccm=" + ccm +
                ", price=" + price +
                '}';
    }

    // MotorBuilder is an inner class inside the Motor class

    public static class MotorBuilder        // this class is static also
    {
        private final Type type;
        private final String name;
        private Integer cylinder;
        private Integer ccm;
        private Integer price;

        // This is the constructor of the MotorBuilder class

        public MotorBuilder(Type type, String name) {
            this.type = type;
            this.name = name;
        }

        public MotorBuilder cylinder(Integer cylinder) {
            this.cylinder = cylinder;
            return this;
        }

        public MotorBuilder ccm(Integer ccm) {
            this.ccm = ccm;
            return this;
        }

        public MotorBuilder price(Integer price) {
            this.price = price;
            return this;
        }

        // Return the finally constructed Motor object
        public Motor build() {
            Motor motor = new Motor(this);
            validateMotorObject(motor);
            return motor;
        }

        private void validateMotorObject(Motor motor) {
            // Do some basic validations to check
            // if motor object does not break any assumption of system
        }
    }
}
