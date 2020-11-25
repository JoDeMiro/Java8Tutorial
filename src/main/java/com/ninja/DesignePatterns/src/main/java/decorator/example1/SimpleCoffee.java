package decorator.example1;

public class SimpleCoffee extends Coffee {
    @Override
    public double getCost() {
        return 1;
    }

    @Override
    public String getIngredients() {
        return "Simple Coffee";
    }
}
