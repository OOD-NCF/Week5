public class Table implements Furniture {
    @Override
    public void assemble() {
        System.out.println("Assembling a Table");
    }

    @Override
    public String getMaterial() {
        return "Metal";
    }

    @Override
    public String getType() {
        return "Table";
    }
}
