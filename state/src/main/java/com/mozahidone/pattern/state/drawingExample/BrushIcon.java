package com.mozahidone.pattern.state.drawingExample;

public class BrushIcon implements Tool {
    @Override
    public void mouseDown() {
        System.out.println("Brush icon");
    }

    @Override
    public void mouseUp() {
        System.out.println("Brushing the circle");
    }
}
