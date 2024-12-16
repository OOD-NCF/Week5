// Factory for creating advanced smart home devices
public class AdvancedSmartHomeFactory implements SmartHomeFactory {
    @Override
    public SmartLight createSmartLight() {
        return new AdvancedSmartLight();
    }

    @Override
    public SmartThermostat createSmartThermostat() {
        return new AdvancedSmartThermostat();
    }
}