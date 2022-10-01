package com.mozahidone.pattern.state.drawingExample;

public class Canvas {
    private Tool currenTool;

    public void mouseDown() {
        currenTool.mouseDown();
    }

    public void mouseUp() {
        currenTool.mouseUp();
    }

    public Tool getCurrenTool() {
        return currenTool;
    }

    public void setCurrenTool(Tool currenTool) {
        this.currenTool = currenTool;
    }
}
