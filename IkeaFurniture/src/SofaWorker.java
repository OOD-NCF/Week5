public class SofaWorker implements Worker {
    @Override
    public String getName() {
        return "Charlie";
    }

    @Override
    public String getSkills() {
        return "Skilled in assembling Sofas";
    }

    @Override
    public void assembleFurniture(Furniture furniture) {
        System.out.println("Charlie is assembling a " + furniture.getType());
        furniture.assemble();
    }
}
