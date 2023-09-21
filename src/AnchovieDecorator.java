public class AnchovieDecorator extends PizzaDecorator {
    public AnchovieDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double cost() {
        return super.cost() + 2.0;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Anchovies";
    }
}
