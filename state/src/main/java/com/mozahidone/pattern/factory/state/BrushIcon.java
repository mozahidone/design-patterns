package com.mozahidone.pattern.factory.state;

public class BrushIcon implements Tool {
    @Override
    public void mouseDown() {
        System.out.println("Brush icon");
    }

    @Override
    public void mouseUp() {
        System.out.println("");
    }
}
