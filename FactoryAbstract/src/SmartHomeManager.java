public class SmartHomeManager {
    private SmartLight light;
    private SmartThermostat thermostat;

    public SmartHomeManager(SmartHomeFactory factory) {
        light = factory.createSmartLight();
        thermostat = factory.createSmartThermostat();
    }

    public void configureHome(int temperature) {
        light.turnOn();
        thermostat.setTemperature(temperature);
        light.turnOff();
    }
}