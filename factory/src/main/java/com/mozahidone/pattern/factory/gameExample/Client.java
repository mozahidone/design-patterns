package com.mozahidone.pattern.factory.gameExample;

public class Client {

    public static void main(String[] args) {
        GameFactory furnitureFactory = new GameFactory();
        Game furniture = furnitureFactory.getFurniture("Football");
        System.out.println(furniture.getName());

        furniture = furnitureFactory.getFurniture("Cricket");
        System.out.println(furniture.getName());
    }
}
