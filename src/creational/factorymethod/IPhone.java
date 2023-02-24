package creational.factorymethod;

public class IPhone extends SmartPhone{
    private String modelName;
    public IPhone(String modelname) {
        this.modelName = modelname;
    }

    @Override
    public String getModel() {
        return this.modelName;
    }
}
