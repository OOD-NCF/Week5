public class ChairWorker implements Worker {
    @Override
    public String getName() {
        return "Alice";
    }

    @Override
    public String getSkills() {
        return "Skilled in assembling Chairs";
    }

    @Override
    public void assembleFurniture(Furniture furniture) {
        System.out.println("Alice is assembling a " + furniture.getType());
        furniture.assemble();
    }
}
