public class PizzaFactory {
    public Pizza createPizza(String type) {
        if (type.equalsIgnoreCase("Margherita")) {
            return new MargheritaPizza();
        } else if (type.equalsIgnoreCase("Pepperoni")) {
            return new PepperoniPizza();
        } else if (type.equalsIgnoreCase("Veggie")) {
            return new VeggiePizza();
        } else {
            return null;  // Return null if no matching type is found
        }
    }
}