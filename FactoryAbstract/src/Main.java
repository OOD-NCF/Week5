public class Main {
    public static void main(String[] args) {
        // Using the BasicSmartHomeFactory
        SmartHomeFactory basicFactory = new BasicSmartHomeFactory();
        SmartHomeManager basicHomeManager = new SmartHomeManager(basicFactory);
        basicHomeManager.configureHome(22);  // Configuring with basic devices

        // Using the AdvancedSmartHomeFactory
        SmartHomeFactory advancedFactory = new AdvancedSmartHomeFactory();
        SmartHomeManager advancedHomeManager = new SmartHomeManager(advancedFactory);
        advancedHomeManager.configureHome(24);  // Configuring with advanced devices
    }
}