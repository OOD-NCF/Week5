public class BasicSmartLight implements SmartLight {
    @Override
    public void turnOn() {
        System.out.println("Basic Smart Light is now ON.");
    }

    @Override
    public void turnOff() {
        System.out.println("Basic Smart Light is now OFF.");
    }
}