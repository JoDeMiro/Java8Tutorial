package builder.example1;

public class Example {
    public static void main(String[] args) {

        Dog german = new Dog.DogBuilder("German", "Coyote").code("abc").address("Budapest").id(1L).build();

        System.out.println(german);


        Dog dog = new Dog.DogBuilder("German", "Anubis").code("abc").build();

        System.out.println(dog);
    }
}
