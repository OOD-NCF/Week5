

public class PizzaStoreOrderType {
    private PizzaFactory pizzaFactory;

    // Constructor to initialize the PizzaFactory
    public PizzaStoreOrderType(PizzaFactory factory) {
        this.pizzaFactory = factory;
    }

    // Order method to encapsulate the pizza ordering process
    public void orderPizza(String type, OrderType orderType) {
        Pizza pizza = pizzaFactory.createPizza(type);
        if (pizza != null) {
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();

            // Determine the order type: Carryout or Pickup
            if (orderType == OrderType.CARRYOUT) {
                System.out.println(type + " pizza ordered for carryout!");
            } else if (orderType == OrderType.PICKUP) {
                System.out.println(type + " pizza ordered for pickup!");
            }
            System.out.println();
        } else {
            System.out.println("Sorry, we don't have " + type + " pizza.\n");
        }
    }

    // Main method to test the pizza store
    public static void main(String[] args) {
        PizzaFactory pizzaFactory = new PizzaFactory();  // Create a factory
        PizzaStoreOrderType pizzaStore = new PizzaStoreOrderType(pizzaFactory);  // Create the pizza store with factory

        // Order different pizzas with different order types
        pizzaStore.orderPizza("Margherita", OrderType.CARRYOUT);
        pizzaStore.orderPizza("Pepperoni", OrderType.PICKUP);
        pizzaStore.orderPizza("Veggie", OrderType.CARRYOUT);
        pizzaStore.orderPizza("Hawaiian", OrderType.PICKUP);  // Non-existent pizza type for testing
    }
}