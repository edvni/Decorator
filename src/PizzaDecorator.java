public class PizzaDecorator implements Pizza {
    private final Pizza pizza;

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public double cost() {
        return pizza.cost();
    }

    @Override
    public String getDescription() {
        return pizza.getDescription();
    }
}
