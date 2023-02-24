package creational.factorymethod;

public class Xiaomi extends SmartPhone{
    private String modelName;
    public Xiaomi(String modelname) {
        this.modelName = modelname;
    }
    @Override
    public String getModel() {
        return this.modelName;
    }
}
