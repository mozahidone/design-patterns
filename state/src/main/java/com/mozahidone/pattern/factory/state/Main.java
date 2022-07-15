package com.mozahidone.pattern.factory.state;

public class Main {
    public static void main(String[] args) {
        Canvas canvas = new Canvas();
        canvas.setCurrenTool(new SelectionTool());

        canvas.mouseDown();
        canvas.mouseUp();
    }
}
