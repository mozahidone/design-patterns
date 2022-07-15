package com.mozahidone.pattern.factory.memento;

public class Editor {
    private String content;

    public EditorState createState(String content) {
        return new EditorState(content);
    }

    public void restore(EditorState state) {
        content = state.getContent();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
