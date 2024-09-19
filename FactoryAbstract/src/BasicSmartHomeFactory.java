public class BasicSmartHomeFactory implements SmartHomeFactory {
    @Override
    public SmartLight createSmartLight() {
        return new BasicSmartLight();
    }

    @Override
    public SmartThermostat createSmartThermostat() {
        return new BasicSmartThermostat();
    }
}