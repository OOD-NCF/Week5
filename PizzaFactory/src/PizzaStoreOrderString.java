public class PizzaStoreOrderString {

    private PizzaFactory pizzaFactory;

    // Constructor to initialize the PizzaFactory
    public PizzaStoreOrderString(PizzaFactory factory) {
        this.pizzaFactory = factory;
    }

    // Order method to handle the pizza ordering process based on string input for order type
    public void orderPizza(String type, String orderType) {
        Pizza pizza = pizzaFactory.createPizza(type);
        if (pizza != null) {
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();

            // Determine the order type based on string input
            if (orderType.equalsIgnoreCase("carryout")) {
                System.out.println(type + " pizza ordered for carryout!");
            } else if (orderType.equalsIgnoreCase("pickup")) {
                System.out.println(type + " pizza ordered for pickup!");
            } else {
                System.out.println("Unknown order type: " + orderType);
            }
            System.out.println();
        } else {
            System.out.println("Sorry, we don't have " + type + " pizza.\n");
        }
    }

    // Main method to test the pizza store
    public static void main(String[] args) {
        PizzaFactory pizzaFactory = new PizzaFactory();  // Create a factory
        PizzaStoreOrderString pizzaStore = new PizzaStoreOrderString(pizzaFactory);  // Create the pizza store with factory

        // Order different pizzas with different order types (as strings)
        pizzaStore.orderPizza("Margherita", "carryout");
        pizzaStore.orderPizza("Pepperoni", "pickup");
        pizzaStore.orderPizza("Veggie", "carryout");
        pizzaStore.orderPizza("Hawaiian", "pickup");  // Non-existent pizza type for testing
        pizzaStore.orderPizza("Pepperoni", "delivery");  // Invalid order type for testing
    }
}
// Compare this snippet from src/PizzaStoreOrderType.java: