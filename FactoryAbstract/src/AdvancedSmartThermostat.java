// Concrete product for advanced thermostat
public class AdvancedSmartThermostat implements SmartThermostat {
    @Override
    public void setTemperature(int temperature) {
        System.out.println("Advanced Thermostat with scheduling is set to " + temperature + "°C.");
    }
}