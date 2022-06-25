package abstractfactory;

public class Client {

    public static void main(String[] args) {
        AbstractFactory abstractFactory = AbstractFactoryProducer.getFurniture(true);
        Furniture furniture = abstractFactory.getFurniture("chair");
        System.out.print(furniture.getName());
    }
}
