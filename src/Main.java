public class Main {
    public static void main(String[] args) {
        Pizza pepperoniPizza = new PizzaDough();
        Pizza cheesePizza = new PizzaDough();
        Pizza anchoviePizza = new PizzaDough();

        System.out.println("Pizza menu:\n");

        System.out.println("Pepperoni pizza:");
        pepperoniPizza = new SauceDecorator(pepperoniPizza);
        pepperoniPizza = new CheeseDecorator(pepperoniPizza);
        pepperoniPizza = new PepperoniDecorator(pepperoniPizza);
        System.out.println("$" + pepperoniPizza.cost() + "\n" + pepperoniPizza.getDescription() + ".\n");

        System.out.println("Cheese pizza:");
        cheesePizza = new SauceDecorator(cheesePizza);
        cheesePizza = new CheeseDecorator(cheesePizza);
        System.out.println("$" + cheesePizza.cost() + "\n" + cheesePizza.getDescription() + ".\n");

        System.out.println("Anchovie pizza:");
        anchoviePizza = new SauceDecorator(anchoviePizza);
        anchoviePizza = new CheeseDecorator(anchoviePizza);
        anchoviePizza = new AnchovieDecorator(anchoviePizza);
        System.out.println("$" + anchoviePizza.cost() + "\n" + anchoviePizza.getDescription() + ".\n");

    }
}
