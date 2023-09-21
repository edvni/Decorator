public class PizzaDough implements Pizza {

    @Override
    public double cost() {
        return 10.0;
    }

    @Override
    public String getDescription() {
        return "Pizza dough";
    }
}
