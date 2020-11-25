package decorator.example1;

public abstract class CoffeeDecorator extends Coffee {
    protected final Coffee decoratedCoffee;
    protected String ingredientSeparator = ", ";

    public CoffeeDecorator(Coffee decoratedCoffee) {
        this.decoratedCoffee = decoratedCoffee;
    }

    @Override
    public double getCost() {
        return decoratedCoffee.getCost();
    }

    @Override
    public String getIngredients() {
        return decoratedCoffee.getIngredients();
    }
}

class Milk extends CoffeeDecorator {

    public Milk(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.5;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + ingredientSeparator + "Milk";
    }
}

class Whip extends CoffeeDecorator {

    public Whip(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.6;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + ingredientSeparator + "Whip";
    }
}

class Sprinkles extends CoffeeDecorator {

    public Sprinkles(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.2;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + ingredientSeparator + "Sprinkles";
    }
}