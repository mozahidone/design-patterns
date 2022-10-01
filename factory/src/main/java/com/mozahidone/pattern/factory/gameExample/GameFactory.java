package com.mozahidone.pattern.factory.gameExample;

public class GameFactory {

    public Game getFurniture(String type) {
        if(type == null)
            return null;
        if(type.equalsIgnoreCase("Football"))
            return new Football();
        if(type.equalsIgnoreCase("Cricket"))
            return new Cricket();
        return null;
    }
}
