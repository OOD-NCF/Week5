public class Sofa implements Furniture {
    @Override
    public void assemble() {
        System.out.println("Assembling a Sofa");
    }

    @Override
    public String getMaterial() {
        return "Fabric";
    }

    @Override
    public String getType() {
        return "Sofa";
    }
}
