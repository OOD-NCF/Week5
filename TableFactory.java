public class TableFactory implements FurnitureFactory {
    @Override
    public Furniture createFurniture() {
        return new Table();
    }

    @Override
    public Worker createWorker() {
        return new TableWorker();
    }
}
