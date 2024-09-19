// Concrete product for advanced light
public class AdvancedSmartLight implements SmartLight {
    @Override
    public void turnOn() {
        System.out.println("Advanced Smart Light with voice control is now ON.");
    }

    @Override
    public void turnOff() {
        System.out.println("Advanced Smart Light with voice control is now OFF.");
    }
}