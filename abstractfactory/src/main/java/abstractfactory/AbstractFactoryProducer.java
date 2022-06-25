package abstractfactory;

// this is factory of factory , gives u factory instance which wil in turn give u required class object
public class AbstractFactoryProducer {

    public static AbstractFactory getFurniture(boolean isWooden) {
        if(isWooden) {
            return new WoodenFurnitureFactory();
        }
        else {
            return new SteelFurnitureFactory();
        }
    }

}
