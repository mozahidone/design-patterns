package abstractfactory;

public class SteelFurnitureFactory implements AbstractFactory {

    @Override
    public Furniture getFurniture(String type) {
        if(type == null)
            return null;
        if(type.equalsIgnoreCase("chair"))
            return new SteelChair();
        if(type.equalsIgnoreCase("table"))
            return new SteelTable();
        return null;
    }
}
