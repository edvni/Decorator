public class CheeseDecorator extends PizzaDecorator {

    public CheeseDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double cost() {
        return super.cost() + 1.5;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Cheese";
    }
}
