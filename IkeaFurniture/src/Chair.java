public class Chair implements Furniture {
    @Override
    public void assemble() {
        System.out.println("Assembling a Chair");
    }

    @Override
    public String getMaterial() {
        return "Wood";
    }

    @Override
    public String getType() {
        return "Chair";
    }
}
