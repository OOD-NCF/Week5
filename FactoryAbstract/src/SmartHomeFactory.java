// Abstract factory for creating related products (lights and thermostats)
public interface SmartHomeFactory {
    SmartLight createSmartLight();
    SmartThermostat createSmartThermostat();
}