package com.mozahidone.pattern.state.drawingExample;

public class Main {
    public static void main(String[] args) {
        Canvas canvas = new Canvas();
        //canvas.setCurrenTool(new SelectionTool());
        canvas.setCurrenTool(new BrushIcon());

        canvas.mouseDown();
        canvas.mouseUp();
    }
}
