package com.mozahidone.pattern.factory.furnitureExample;

public class Client {

    public static void main(String[] args) {
        FurnitureFactory furnitureFactory = new FurnitureFactory();
        Furniture furniture = furnitureFactory.getFurniture("chair");
        System.out.println(furniture.getName());

        furniture = furnitureFactory.getFurniture("table");
        System.out.println(furniture.getName());
    }
}
