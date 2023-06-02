package com.homework210.homework210.model;

public class Item {
    private String id;
    public Item(String id) {
        this.id = id;
    }
    @Override
    public String toString() {
        return "Item{" +
                "id='" + id + '\'' +
                '}';
    }
}
