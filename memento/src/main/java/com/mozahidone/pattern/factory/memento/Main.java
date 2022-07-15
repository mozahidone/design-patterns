package com.mozahidone.pattern.factory.memento;

public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();
        History history = new History();

        editor.setContent("a");
        history.push(editor.createState(editor.getContent()));

        editor.setContent("b");
        history.push(editor.createState(editor.getContent()));

        editor.setContent("c");
        editor.restore(history.pop());
        editor.restore(history.pop());

        System.out.println(editor.getContent());
    }
}
