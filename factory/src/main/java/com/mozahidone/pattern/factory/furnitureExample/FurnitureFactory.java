package com.mozahidone.pattern.factory.furnitureExample;

public class FurnitureFactory {

    public Furniture getFurniture(String type) {
        if(type == null)
            return null;
        if(type.equalsIgnoreCase("chair"))
            return new Chair();
        if(type.equalsIgnoreCase("table"))
            return new Table();
        return null;
    }
}
