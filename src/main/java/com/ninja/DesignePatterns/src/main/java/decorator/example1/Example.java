package decorator.example1;

public class Example {
    public static void main(String[] args) {

        Coffee simpleCoffee = new SimpleCoffee();
        System.out.println(simpleCoffee.getCost() + ", " + simpleCoffee.getIngredients());

        Coffee coffee1 = new Milk(new SimpleCoffee());
        System.out.println(coffee1.getCost() + ", " + coffee1.getIngredients());

        Coffee coffee2 = new Whip(new Milk(new SimpleCoffee()));
        System.out.println(coffee2.getCost() + ", " + coffee2.getIngredients());


    }
}
