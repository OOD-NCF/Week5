public class TableWorker implements Worker {
    @Override
    public String getName() {
        return "Bob";
    }

    @Override
    public String getSkills() {
        return "Skilled in assembling Tables";
    }

    @Override
    public void assembleFurniture(Furniture furniture) {
        System.out.println("Bob is assembling a " + furniture.getType());
        furniture.assemble();
    }
}
