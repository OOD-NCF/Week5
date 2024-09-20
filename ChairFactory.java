public class ChairFactory implements FurnitureFactory {
    @Override
    public Furniture createFurniture() {
        return new Chair();
    }

    @Override
    public Worker createWorker() {
        return new ChairWorker();
    }
}
