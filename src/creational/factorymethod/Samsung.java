package creational.factorymethod;

public class Samsung extends SmartPhone{
    private String modelName;
    public Samsung(String modelname) {
        this.modelName = modelname;
    }

    @Override
    public String getModel() {
        return this.modelName;
    }
}
