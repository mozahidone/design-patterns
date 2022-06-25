package abstractfactory;

public class WoodenFurnitureFactory implements AbstractFactory {

    @Override
    public Furniture getFurniture(String type) {
        if(type == null)
            return null;
        if(type.equalsIgnoreCase("chair"))
            return new WoodenChair();
        if(type.equalsIgnoreCase("table"))
            return new WoodenTable();
        return null;
    }
}
