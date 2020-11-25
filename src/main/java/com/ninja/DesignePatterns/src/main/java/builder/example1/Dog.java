package builder.example1;

public class Dog {

    // All final attributes
    private final String breed;   // required
    private final String name;    // required
    private final String code;    // optional
    private final String address; // optional
    private final Long id;        // optional

    // Dog class constructor require a DogBuilder class as a parameter

    private Dog(DogBuilder builder) {
        this.breed = builder.breed;
        this.name = builder.name;
        this.code = builder.code;
        this.address = builder.address;
        this.id = builder.id;
    }

    // All Getter and no Setter to provide immutability
    public String getBreed() {
        return breed;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public String getAddress() {
        return address;
    }

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + this.breed + '\'' +
                ", name='" + this.name + '\'' +
                ", code='" + this.code + '\'' +
                ", address='" + this.address + '\'' +
                ", id=" + this.id +
                '}';
    }

    // DogBuilder is an inner class inside the Dog class

    public static class DogBuilder      // this class is static also
    {
        private final String breed;
        private final String name;
        private String code;
        private String address;
        private Long id;

        // This is the constructor of this DogBuilder class

        public DogBuilder(String breed, String name) {
            this.breed = breed;
            this.name = name;
        }

        public DogBuilder code(String code) {
            this.code = code;
            return this;
        }

        public DogBuilder address(String address) {
            this.address = address;
            return this;
        }

        public DogBuilder id(Long id) {
            this.id = id;
            return this;
        }

        // Return the finally constructed Dog object
        public Dog build(){
            Dog dog = new Dog(this);
            validateDogObject(dog);
            return dog;
        }

        private void validateDogObject(Dog dog) {
            // Do some basic validations to check
            // if dog object does not break any assumption of system
        }
    }
}
