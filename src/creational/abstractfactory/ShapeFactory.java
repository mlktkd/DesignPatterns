package creational.abstractfactory;

public class ShapeFactory extends AbstractFactory{

    @Override
    IShape getShape(String shape) {
        if(shape == null) {
            return null;
        }
        if(shape.equalsIgnoreCase("Circle")) {
            return new Circle();
        }
        if(shape.equalsIgnoreCase("Rectangle")) {
            return new Rectangle();
        }
        if(shape.equalsIgnoreCase("Triangle")) {
            return new Triangle();
        }
        if(shape.equalsIgnoreCase("Ellipse")) {
            return new Ellipse();
        }
        return null;
    }
}
