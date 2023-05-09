package com.example.foldingcellrecyclerview;

public class ItemObject {
    private String open;
    private String content;

    public ItemObject(String open, String content) {
        this.open = open;
        this.content = content;
    }

    public String getOpen() {
        return open;
    }

    public void setOpen(String open) {
        this.open = open;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
