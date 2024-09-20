public class IkeaClient {
    public static void main(String[] args) {
        // Create a ChairFactory and simulate the production process
        FurnitureFactory chairFactory = new ChairFactory();
        Furniture chair = chairFactory.createFurniture();
        Worker chairWorker = chairFactory.createWorker();

        chairWorker.assembleFurniture(chair);

        // Create a TableFactory and simulate the production process
        FurnitureFactory tableFactory = new TableFactory();
        Furniture table = tableFactory.createFurniture();
        Worker tableWorker = tableFactory.createWorker();

        tableWorker.assembleFurniture(table);

        // Create a SofaFactory and simulate the production process
        FurnitureFactory sofaFactory = new SofaFactory();
        Furniture sofa = sofaFactory.createFurniture();
        Worker sofaWorker = sofaFactory.createWorker();

        sofaWorker.assembleFurniture(sofa);
    }
}
