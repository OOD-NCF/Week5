public class SofaFactory implements FurnitureFactory {
    @Override
    public Furniture createFurniture() {
        return new Sofa();
    }

    @Override
    public Worker createWorker() {
        return new SofaWorker();
    }
}
