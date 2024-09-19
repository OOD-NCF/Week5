// Concrete product for basic thermostat
public class BasicSmartThermostat implements SmartThermostat {
    @Override
    public void setTemperature(int temperature) {
        System.out.println("Basic Thermostat is set to " + temperature + "°C.");
    }
}